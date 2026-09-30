package defpackage;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wud extends fbc {
    public final d0a a = new d0a();
    public final zu1 b = new zu1();
    public rye c;

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    @Override // defpackage.fbc
    public final su8 f(zu8 zu8Var, ByteBuffer byteBuffer) {
        qu8 xudVar;
        long j;
        long j2;
        d0a d0aVar = this.a;
        zu1 zu1Var = this.b;
        rye ryeVar = this.c;
        if (ryeVar != null) {
            long j3 = zu8Var.x;
            synchronized (ryeVar) {
                j2 = ryeVar.b;
            }
            if (j3 != j2) {
                rye ryeVar2 = new rye(zu8Var.g);
                this.c = ryeVar2;
                ryeVar2.a(zu8Var.g - zu8Var.x);
            }
        } else {
            rye ryeVar3 = new rye(zu8Var.g);
            this.c = ryeVar3;
            ryeVar3.a(zu8Var.g - zu8Var.x);
        }
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        d0aVar.K(bArrArray, iLimit);
        zu1Var.l(bArrArray, iLimit);
        zu1Var.o(39);
        long jG = (((long) zu1Var.g(1)) << 32) | ((long) zu1Var.g(32));
        zu1Var.o(20);
        int iG = zu1Var.g(12);
        int iG2 = zu1Var.g(8);
        d0aVar.N(14);
        if (iG2 == 0) {
            xudVar = new xud();
        } else if (iG2 == 255) {
            long jB = d0aVar.B();
            int i = iG - 4;
            d0aVar.k(new byte[i], 0, i);
            xudVar = new bva(jB, 0, jG);
        } else if (iG2 == 4) {
            int iZ = d0aVar.z();
            ArrayList arrayList = new ArrayList(iZ);
            for (int i2 = 0; i2 < iZ; i2++) {
                d0aVar.B();
                boolean z = (d0aVar.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
                ArrayList arrayList2 = new ArrayList();
                if (!z) {
                    int iZ2 = d0aVar.z();
                    boolean z2 = (iZ2 & 64) != 0;
                    boolean z3 = (iZ2 & 32) != 0;
                    if (z2) {
                        d0aVar.B();
                    }
                    if (!z2) {
                        int iZ3 = d0aVar.z();
                        ArrayList arrayList3 = new ArrayList(iZ3);
                        for (int i3 = 0; i3 < iZ3; i3++) {
                            d0aVar.z();
                            d0aVar.B();
                            arrayList3.add(new eu4(29));
                        }
                        arrayList2 = arrayList3;
                    }
                    if (z3) {
                        d0aVar.z();
                        d0aVar.B();
                    }
                    d0aVar.G();
                    d0aVar.z();
                    d0aVar.z();
                }
                yx4 yx4Var = new yx4(29);
                Collections.unmodifiableList(arrayList2);
                arrayList.add(yx4Var);
            }
            xudVar = new xud();
            Collections.unmodifiableList(arrayList);
        } else if (iG2 == 5) {
            rye ryeVar4 = this.c;
            d0aVar.B();
            boolean z4 = (d0aVar.z() & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0;
            List list = Collections.EMPTY_LIST;
            if (z4) {
                j = -9223372036854775807L;
            } else {
                int iZ4 = d0aVar.z();
                boolean z5 = (iZ4 & 64) != 0;
                boolean z6 = (iZ4 & 32) != 0;
                boolean z7 = (iZ4 & 16) != 0;
                long jD = (!z5 || z7) ? -9223372036854775807L : bva.d(jG, d0aVar);
                if (!z5) {
                    int iZ5 = d0aVar.z();
                    ArrayList arrayList4 = new ArrayList(iZ5);
                    for (int i4 = 0; i4 < iZ5; i4++) {
                        d0aVar.z();
                        ryeVar4.b(!z7 ? bva.d(jG, d0aVar) : -9223372036854775807L);
                        arrayList4.add(new y25(28));
                    }
                    list = arrayList4;
                }
                if (z6) {
                    d0aVar.z();
                    d0aVar.B();
                }
                d0aVar.G();
                d0aVar.z();
                d0aVar.z();
                j = jD;
            }
            xudVar = new bva(j, ryeVar4.b(j), list);
        } else if (iG2 != 6) {
            xudVar = null;
        } else {
            rye ryeVar5 = this.c;
            long jD2 = bva.d(jG, d0aVar);
            xudVar = new bva(jD2, 2, ryeVar5.b(jD2));
        }
        return xudVar == null ? new su8(new qu8[0]) : new su8(xudVar);
    }
}
