package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jq4 implements cyc, pq4 {
    public final /* synthetic */ int a;
    public final cyc b;
    public final int c;

    public jq4(cyc cycVar, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = cycVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                qc0.o(tec.k("count must be non-negative, but was ", i, '.'));
                throw null;
            default:
                cycVar.getClass();
                this.b = cycVar;
                this.c = i;
                if (i >= 0) {
                    return;
                }
                qc0.o(tec.k("count must be non-negative, but was ", i, '.'));
                throw null;
        }
    }

    @Override // defpackage.pq4
    public final cyc a(int i) {
        int i2 = this.a;
        cyc cycVar = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new jq4(this, i, 1) : new l6e(cycVar, i3, i4);
            default:
                return i >= i3 ? this : new jq4(cycVar, i, 1);
        }
    }

    @Override // defpackage.pq4
    public final cyc b(int i) {
        int i2 = this.a;
        cyc cycVar = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new jq4(this, i, 0) : new jq4(cycVar, i4, 0);
            default:
                return i >= i3 ? wu4.a : new l6e(cycVar, i, i3);
        }
    }

    @Override // defpackage.cyc
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new iq4(this);
            default:
                return new iq4(this, (byte) 0);
        }
    }
}
