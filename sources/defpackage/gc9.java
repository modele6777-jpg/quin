package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gc9 {
    public static final LinkedHashMap b = new LinkedHashMap();
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(fc9 fc9Var) {
        fc9Var.getClass();
        String strT = od4.t(fc9Var.getClass());
        if (strT.length() <= 0) {
            qc0.j("navigator name cannot be an empty string");
            return;
        }
        LinkedHashMap linkedHashMap = this.a;
        fc9 fc9Var2 = (fc9) linkedHashMap.get(strT);
        if (pa7.t(fc9Var2, fc9Var)) {
            return;
        }
        if (fc9Var2 != null && fc9Var2.b) {
            ho7.u("Navigator ", fc9Var, " is replacing an already attached ", fc9Var2);
        } else if (fc9Var.b) {
            r82.e(fc9Var, " is already attached to another NavController", "Navigator ");
        }
    }

    public final fc9 b(String str) {
        str.getClass();
        if (str.length() <= 0) {
            qc0.j("navigator name cannot be an empty string");
            return null;
        }
        fc9 fc9Var = (fc9) this.a.get(str);
        if (fc9Var != null) {
            return fc9Var;
        }
        qc0.p(ib8.j("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        return null;
    }
}
