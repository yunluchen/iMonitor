package ccnt.gf.imonitor.engine;

import java.util.ArrayList;
import java.util.List;

import org.jnetpcap.Pcap;
import org.jnetpcap.PcapIf;

public class CaptureEngine {

	public static void main(String[] args) {
		List<PcapIf> alldevs = new ArrayList<PcapIf>();
		StringBuilder errbuf = new StringBuilder();

		int r = Pcap.findAllDevs(alldevs, errbuf);
		if (r == Pcap.NOT_OK || alldevs.isEmpty()) {
			System.err.printf("Cannot read list of devices, error is %s\n",
					errbuf.toString());
			return;
		}

		System.out.println("Network devices found:");

		int index = 0;
		for (PcapIf device : alldevs) {
			String description = (device.getDescription() != null) ? device
					.getDescription() : "No description avaiable";
			System.out.printf("#%d: %s [%s]\n", index++, device.getName(), description);
		}
	}

}
