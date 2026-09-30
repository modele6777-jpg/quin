package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gxc {
    public final String a;
    public final l26 b;
    public final boolean c;

    public /* synthetic */ gxc(String str) {
        this(str, new dxc(2, (byte) 0));
    }

    public final String toString() {
        return ub3.i("AccessibilityKey: ", this.a);
    }

    public gxc(String str, l26 l26Var) {
        this.a = str;
        this.b = l26Var;
    }

    public gxc(String str, int i) {
        this(str);
        this.c = true;
    }

    public gxc(String str, boolean z, l26 l26Var) {
        this(str, l26Var);
        this.c = z;
    }
}
