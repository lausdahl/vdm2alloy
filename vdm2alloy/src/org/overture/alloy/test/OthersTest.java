package org.overture.alloy.test;
import java.io.File;

import org.overture.alloy.Main;

public class OthersTest extends Vdm2AlloyBaseTest
{

	public void testPlanner() throws Exception
	{
		File vdm = new File(getInputDir(), "planner.vdmsl");
		File output = new File(getOutputDir(), "planner.als");
		assertEquals(Main.execute(new String[] { "-vdm", vdm.getPath(), "-o",
				output.getPath(), "-v",  }), 0);
	}
	
	public void testTraffic() throws Exception
	{
		File vdm = new File(getInputDir(), "traffic.vdmsl");
		File output = new File(getOutputDir(), "traffic.als");
		assertEquals(Main.execute(new String[] { "-vdm", vdm.getPath(), "-o",
				output.getPath(), "-v",  }), 0);
	}

}