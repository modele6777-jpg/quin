package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class tdg implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ mmb b;
    public final /* synthetic */ yhb c;
    public final /* synthetic */ mmb d;
    public final /* synthetic */ mmb e;

    public /* synthetic */ tdg(yhb yhbVar, mmb mmbVar, mmb mmbVar2, mmb mmbVar3) {
        this.c = yhbVar;
        this.b = mmbVar;
        this.d = mmbVar2;
        this.e = mmbVar3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws IOException {
        int i = this.a;
        wef wefVar = wef.a;
        mmb mmbVar = this.e;
        mmb mmbVar2 = this.d;
        yhb yhbVar = this.c;
        mmb mmbVar3 = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                if (iIntValue != 21589) {
                    return wefVar;
                }
                if (jLongValue >= 1) {
                    byte bU = yhbVar.u();
                    boolean z = (bU & 1) == 1;
                    boolean z2 = (bU & 2) == 2;
                    boolean z3 = (bU & 4) == 4;
                    long j = z ? 5L : 1L;
                    if (z2) {
                        j += 4;
                    }
                    if (z3) {
                        j += 4;
                    }
                    if (jLongValue >= j) {
                        if (z) {
                            mmbVar3.element = Integer.valueOf(yhbVar.G());
                        }
                        if (z2) {
                            mmbVar2.element = Integer.valueOf(yhbVar.G());
                        }
                        if (!z3) {
                            return wefVar;
                        }
                        mmbVar.element = Integer.valueOf(yhbVar.G());
                        return wefVar;
                    }
                    yg5.m("bad zip: extended timestamp extra too short");
                } else {
                    yg5.m("bad zip: extended timestamp extra too short");
                }
                return null;
            default:
                int iIntValue2 = ((Integer) obj).intValue();
                long jLongValue2 = ((Long) obj2).longValue();
                if (iIntValue2 != 1) {
                    return wefVar;
                }
                if (mmbVar3.element != null) {
                    yg5.m("bad zip: NTFS extra attribute tag 0x0001 repeated");
                } else {
                    if (jLongValue2 == 24) {
                        mmbVar3.element = Long.valueOf(yhbVar.N());
                        mmbVar2.element = Long.valueOf(yhbVar.N());
                        mmbVar.element = Long.valueOf(yhbVar.N());
                        return wefVar;
                    }
                    yg5.m("bad zip: NTFS extra attribute tag 0x0001 size != 24");
                }
                return null;
        }
    }

    public /* synthetic */ tdg(mmb mmbVar, yhb yhbVar, mmb mmbVar2, mmb mmbVar3) {
        this.b = mmbVar;
        this.c = yhbVar;
        this.d = mmbVar2;
        this.e = mmbVar3;
    }
}
