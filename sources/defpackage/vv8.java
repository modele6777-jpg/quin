package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vv8 {
    public final f09 a;
    public final int b;
    public final int c;
    public final int d;
    public final /* synthetic */ gg7 e;

    public vv8(gg7 gg7Var, f09 f09Var, int i, int i2, int i3) {
        this.e = gg7Var;
        this.a = f09Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final int a() {
        f09 f09Var = this.a;
        f09 f09Var2 = f09.BYTE;
        int i = this.d;
        if (f09Var != f09Var2) {
            return i;
        }
        zi0 zi0Var = (zi0) this.e.d;
        ds4 ds4Var = (ds4) zi0Var.c;
        String str = (String) zi0Var.b;
        int i2 = this.b;
        return str.substring(i2, i + i2).getBytes(ds4Var.a[this.c].charset()).length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        f09 f09Var = this.a;
        sb.append(f09Var);
        sb.append('(');
        zi0 zi0Var = (zi0) this.e.d;
        if (f09Var == f09.ECI) {
            ds4 ds4Var = (ds4) zi0Var.c;
            sb.append(ds4Var.a[this.c].charset().displayName());
        } else {
            String str = (String) zi0Var.b;
            int i = this.d;
            int i2 = this.b;
            String strSubstring = str.substring(i2, i + i2);
            StringBuilder sb2 = new StringBuilder();
            for (int i3 = 0; i3 < strSubstring.length(); i3++) {
                if (strSubstring.charAt(i3) < ' ' || strSubstring.charAt(i3) > '~') {
                    sb2.append('.');
                } else {
                    sb2.append(strSubstring.charAt(i3));
                }
            }
            sb.append(sb2.toString());
        }
        sb.append(')');
        return sb.toString();
    }
}
