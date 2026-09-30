package defpackage;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ws0 implements r37 {
    public static final Pattern a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // defpackage.r37
    public final fz3 a(x37 x37Var) {
        xg3 xg3Var = x37Var.y;
        xg3Var.j();
        char cM = xg3Var.m();
        if (cM == '\n') {
            xg3Var.j();
            return new fz3(28, new ih6(), xg3Var.n());
        }
        if (!a.matcher(String.valueOf(cM)).matches()) {
            return new fz3(28, new ime("\\"), xg3Var.n());
        }
        xg3Var.j();
        return new fz3(28, new ime(String.valueOf(cM)), xg3Var.n());
    }
}
