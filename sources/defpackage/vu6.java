package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vu6 implements ei7 {
    public static final vu6 b = new vu6("if");
    public static final vu6 c = new vu6("?:");
    public final String a;

    public vu6(String str) {
        this.a = str;
    }

    @Override // defpackage.ei7
    public final Object a(kb6 kb6Var, ai7 ai7Var, Object obj, String str) {
        List list = ai7Var.a;
        if (list.size() < 1) {
            return null;
        }
        if (list.size() == 1) {
            return kb6Var.m(ai7Var.get(0), obj, str.concat("[0]"));
        }
        if (list.size() == 2) {
            if (gg7.y(kb6Var.m(ai7Var.get(0), obj, str.concat("[0]")))) {
                return kb6Var.m(ai7Var.get(1), obj, str.concat("[1]"));
            }
            return null;
        }
        for (int i = 0; i < list.size() - 1; i += 2) {
            fi7 fi7Var = ai7Var.get(i);
            int i2 = i + 1;
            fi7 fi7Var2 = ai7Var.get(i2);
            if (gg7.y(kb6Var.m(fi7Var, obj, String.format("%s[%d]", str, Integer.valueOf(i))))) {
                return kb6Var.m(fi7Var2, obj, String.format("%s[%d]", str, Integer.valueOf(i2)));
            }
        }
        if ((list.size() & 1) == 0) {
            return null;
        }
        return kb6Var.m(ai7Var.get(list.size() - 1), obj, String.format("%s[%d]", str, Integer.valueOf(list.size() - 1)));
    }

    @Override // defpackage.ei7
    public final String c() {
        return this.a;
    }
}
