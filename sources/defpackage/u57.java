package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class u57 {
    public final yw0 a;

    public u57(yw0 yw0Var) {
        this.a = yw0Var;
    }

    public Object a(hbc hbcVar) throws t57 {
        Iterable iterableH;
        rs0 rs0Var = (rs0) hbcVar.a;
        StringBuilder sb = new StringBuilder("| (+) '");
        yw0 yw0Var = this.a;
        sb.append(yw0Var);
        sb.append('\'');
        String string = sb.toString();
        rs0Var.getClass();
        rs0Var.H(a48.a, string);
        try {
            nz9 nz9Var = (nz9) hbcVar.e;
            if (nz9Var == null) {
                nz9Var = new nz9(3, null);
            }
            return yw0Var.d.z((nfc) hbcVar.b, nz9Var);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(e);
            sb2.append("\n\t");
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            int i = 0;
            while (i < stackTrace.length) {
                String className = stackTrace[i].getClassName();
                className.getClass();
                if (v4e.F(className, "sun.reflect", false)) {
                    break;
                }
                i++;
            }
            if (i == 0) {
                iterableH = pu4.a;
            } else if (i != 1) {
                iterableH = Arrays.asList(qd0.f0(stackTrace, 0, i));
                iterableH.getClass();
            } else {
                iterableH = t72.H(stackTrace[0]);
            }
            sb2.append(s72.D0(iterableH, "\n\t", null, null, null, 62));
            rs0Var.H(a48.d, "* Instance creation error : could not create instance for '" + yw0Var + "': " + sb2.toString());
            throw new t57("Could not create instance for '" + yw0Var + '\'', e);
        }
    }

    public abstract Object b(hbc hbcVar);
}
