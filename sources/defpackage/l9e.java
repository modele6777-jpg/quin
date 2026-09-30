package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l9e extends n9e {
    public final /* synthetic */ int d = 1;
    public final Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9e(f9e f9eVar, String str) {
        super(f9eVar, str);
        f9eVar.getClass();
        str.getClass();
        this.e = f9eVar.C(str);
    }

    @Override // defpackage.x8c
    public final void Q(int i, String str) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                str.getClass();
                ((m9e) obj).Q(i, str);
                return;
            case 1:
                str.getClass();
                b();
                ((o9e) obj).A(i, str);
                return;
            default:
                str.getClass();
                b();
                p8c.x(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final boolean R0() {
        int i = this.d;
        f9e f9eVar = this.a;
        Object obj = this.e;
        switch (i) {
            case 0:
                m9e m9eVar = (m9e) obj;
                boolean zR0 = m9eVar.R0();
                if (m9eVar.t0(0).equalsIgnoreCase("wal")) {
                    f9eVar.S();
                } else {
                    f9eVar.y();
                }
                return zR0;
            case 1:
                b();
                ((o9e) obj).p();
                return false;
            default:
                int iOrdinal = ((k9e) obj).ordinal();
                if (iOrdinal == 0) {
                    f9eVar.V();
                    f9eVar.q0();
                } else if (iOrdinal == 1) {
                    f9eVar.q0();
                } else if (iOrdinal == 2) {
                    f9eVar.t();
                } else if (iOrdinal == 3) {
                    f9eVar.Z();
                } else if (iOrdinal == 4) {
                    f9eVar.J();
                } else {
                    ap.c();
                }
                return false;
        }
    }

    @Override // defpackage.x8c
    public boolean T() {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).T();
            default:
                return super.T();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() throws IOException {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((m9e) obj).close();
                break;
            case 1:
                ((o9e) obj).close();
                this.c = true;
                break;
            default:
                this.c = true;
                break;
        }
    }

    @Override // defpackage.x8c
    public final byte[] getBlob(int i) {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).getBlob(i);
            case 1:
                b();
                p8c.x(21, "no row");
                throw null;
            default:
                b();
                p8c.x(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final int getColumnCount() {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).getColumnCount();
            case 1:
                b();
                return 0;
            default:
                b();
                return 0;
        }
    }

    @Override // defpackage.x8c
    public final String getColumnName(int i) {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).getColumnName(i);
            case 1:
                b();
                p8c.x(21, "no row");
                throw null;
            default:
                b();
                p8c.x(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final long getLong(int i) {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).getLong(i);
            case 1:
                b();
                p8c.x(21, "no row");
                throw null;
            default:
                b();
                p8c.x(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final boolean isNull(int i) {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).isNull(i);
            case 1:
                b();
                p8c.x(21, "no row");
                throw null;
            default:
                b();
                p8c.x(21, "no row");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final void m(int i, long j) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((m9e) obj).m(i, j);
                return;
            case 1:
                b();
                ((o9e) obj).m(i, j);
                return;
            default:
                b();
                p8c.x(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final void n(byte[] bArr, int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((m9e) obj).n(bArr, i);
                return;
            case 1:
                b();
                ((o9e) obj).n(bArr, i);
                return;
            default:
                b();
                p8c.x(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.x8c
    public final void o(int i) {
        int i2 = this.d;
        Object obj = this.e;
        switch (i2) {
            case 0:
                ((m9e) obj).o(i);
                return;
            case 1:
                b();
                ((o9e) obj).o(i);
                return;
            default:
                b();
                p8c.x(25, "column index out of range");
                throw null;
        }
    }

    @Override // defpackage.n9e, defpackage.x8c
    public void reset() {
        switch (this.d) {
            case 0:
                ((m9e) this.e).reset();
                break;
            default:
                super.reset();
                break;
        }
    }

    @Override // defpackage.n9e, defpackage.x8c
    public void s() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ((m9e) obj).s();
                break;
            case 1:
                b();
                ((o9e) obj).s();
                break;
            default:
                super.s();
                break;
        }
    }

    @Override // defpackage.x8c
    public final String t0(int i) {
        switch (this.d) {
            case 0:
                return ((m9e) this.e).t0(i);
            case 1:
                b();
                p8c.x(21, "no row");
                throw null;
            default:
                b();
                p8c.x(21, "no row");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9e(f9e f9eVar, String str, k9e k9eVar) {
        super(f9eVar, str);
        f9eVar.getClass();
        str.getClass();
        this.e = k9eVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9e(f9e f9eVar, String str, m9e m9eVar) {
        super(f9eVar, str);
        f9eVar.getClass();
        str.getClass();
        this.e = m9eVar;
    }
}
