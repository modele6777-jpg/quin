package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vf2 extends pk1 {
    public final boolean d;

    public vf2(sug sugVar, boolean z) {
        super(sugVar);
        this.d = z;
    }

    @Override // defpackage.pk1
    public final void h(byte b) {
        if (this.d) {
            m(String.valueOf(b & 255));
            return;
        }
        String strValueOf = String.valueOf(b & 255);
        strValueOf.getClass();
        ((sug) this.c).y(strValueOf);
    }

    @Override // defpackage.pk1
    public final void j(int i) {
        boolean z = this.d;
        String unsignedString = Integer.toUnsignedString(i);
        if (z) {
            m(unsignedString);
        } else {
            unsignedString.getClass();
            ((sug) this.c).y(unsignedString);
        }
    }

    @Override // defpackage.pk1
    public final void k(long j) {
        boolean z = this.d;
        String unsignedString = Long.toUnsignedString(j);
        if (z) {
            m(unsignedString);
        } else {
            unsignedString.getClass();
            ((sug) this.c).y(unsignedString);
        }
    }

    @Override // defpackage.pk1
    public final void l(short s) {
        if (this.d) {
            m(String.valueOf(s & 65535));
            return;
        }
        String strValueOf = String.valueOf(s & 65535);
        strValueOf.getClass();
        ((sug) this.c).y(strValueOf);
    }
}
