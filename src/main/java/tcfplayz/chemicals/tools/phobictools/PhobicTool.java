package tcfplayz.chemicals.tools.phobictools;

import tcfplayz.chemicals.elements.Hydrogen;
import tcfplayz.chemicals.utils.tools.Tools;

public class PhobicTool extends Tools {

    public PhobicTool() {
        super(new PhobicTool(), 5000, 15.0f, 15.0f, 75, 100, new Hydrogen());
    }
}
