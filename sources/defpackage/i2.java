package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i2 extends lmg {
    public final Object A;
    public final /* synthetic */ int x = 1;
    public final /* synthetic */ aj7 y;
    public final /* synthetic */ String z;

    public i2(aj7 aj7Var, String str) {
        this.y = aj7Var;
        this.z = str;
        this.A = aj7Var.b.b;
    }

    @Override // defpackage.lmg, defpackage.ev4
    public void B(long j) {
        switch (this.x) {
            case 1:
                t0(Long.toUnsignedString(j));
                break;
            default:
                super.B(j);
                break;
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public void D(String str) {
        switch (this.x) {
            case 0:
                str.getClass();
                this.y.M(new yh7(str, false, (nyc) this.A), this.z);
                break;
            default:
                super.D(str);
                break;
        }
    }

    @Override // defpackage.ev4
    public final hzc a() {
        switch (this.x) {
            case 0:
                return this.y.b.b;
            default:
                return (hzc) this.A;
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public void j(short s) {
        switch (this.x) {
            case 1:
                t0(String.valueOf(s & 65535));
                break;
            default:
                super.j(s);
                break;
        }
    }

    @Override // defpackage.lmg, defpackage.ev4
    public void l(byte b) {
        switch (this.x) {
            case 1:
                t0(String.valueOf(b & 255));
                break;
            default:
                super.l(b);
                break;
        }
    }

    public void t0(String str) {
        str.getClass();
        this.y.M(new yh7(str, false, null), this.z);
    }

    @Override // defpackage.lmg, defpackage.ev4
    public void y(int i) {
        switch (this.x) {
            case 1:
                t0(Integer.toUnsignedString(i));
                break;
            default:
                super.y(i);
                break;
        }
    }

    public i2(aj7 aj7Var, String str, nyc nycVar) {
        this.y = aj7Var;
        this.z = str;
        this.A = nycVar;
    }
}
