package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class m36 {
    public final dx5 a;
    public final String b;
    public final int c;

    public m36(dx5 dx5Var, String str, int i) {
        dx5Var.getClass();
        this.a = dx5Var;
        this.b = str;
        this.c = i;
    }

    public final t99 a(int i) {
        return t99.e(this.b + i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('.');
        return ub3.l(sb, this.b, 'N');
    }
}
