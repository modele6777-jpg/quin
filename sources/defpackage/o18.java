package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o18 implements ucc, qcc {
    public final vcc a;
    public final qcc b;
    public final x79 c;

    public o18(ucc uccVar, Map map, qcc qccVar) {
        za6 za6Var = new za6(20, uccVar);
        pr4 pr4Var = wcc.a;
        this.a = new vcc(map, za6Var);
        this.b = qccVar;
        x79 x79Var = mec.a;
        this.c = new x79();
    }

    @Override // defpackage.ucc
    public final tcc a(String str, x16 x16Var) {
        return this.a.a(str, x16Var);
    }

    @Override // defpackage.qcc
    public final void b(Object obj, dd2 dd2Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-858296452);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(this) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            this.b.b(obj, dd2Var, l46Var, i2 & 126);
            boolean zI = l46Var.i(this) | l46Var.i(obj);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new so5(22, this, obj);
                l46Var.p0(objR);
            }
            af1.g(obj, (a26) objR, l46Var);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, this, obj, dd2Var, 28);
        }
    }

    @Override // defpackage.ucc
    public final boolean c(Object obj) {
        return this.a.c(obj);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0044 A[LOOP:0: B:5:0x000d->B:15:0x0044, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0047 A[EDGE_INSN: B:19:0x0047->B:16:0x0047 BREAK  A[LOOP:0: B:5:0x000d->B:15:0x0044], SYNTHETIC] */
    @Override // defpackage.ucc
    public final Map d() {
        x79 x79Var = this.c;
        Object[] objArr = x79Var.b;
        long[] jArr = x79Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            this.b.f(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return this.a.d();
    }

    @Override // defpackage.ucc
    public final Object e(String str) {
        return this.a.e(str);
    }

    @Override // defpackage.qcc
    public final void f(Object obj) {
        this.b.f(obj);
    }
}
