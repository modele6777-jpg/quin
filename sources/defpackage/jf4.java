package defpackage;

import ai.askquin.ui.conversation.r0;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jf4 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jf4(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                l1f l1fVar = (l1f) obj;
                l1fVar.a(Long.valueOf(j), "time_timestamp");
                fc4 fc4Var = ((r0) obj2).H0;
                if (fc4Var != null) {
                    l1fVar.a(fc4Var.a, "aid");
                    return wefVar;
                }
                pa7.g0("divinationKey");
                throw null;
            case 1:
                kz7 kz7Var = (kz7) obj2;
                kz7Var.d(w67.c(((w67) ((jx) obj).e()).a, j));
                kz7Var.c.invoke();
                return wefVar;
            case 2:
                ude udeVar = (ude) obj2;
                rde rdeVar = (rde) obj;
                rdeVar.getClass();
                final ArrayList arrayList = rdeVar.a;
                final ArrayList arrayList2 = rdeVar.b;
                y72 y72Var = udeVar.c;
                y72Var.getClass();
                long j2 = y72Var.a;
                final long j3 = j2 != 16 ? j2 : j;
                final float fFloatValue = udeVar.d.floatValue();
                return b21.s(g09.a, new a26() { // from class: pde
                    @Override // defpackage.a26
                    public final Object d(Object obj3) {
                        long j4;
                        float f;
                        sn4 sn4Var = (sn4) obj3;
                        sn4Var.getClass();
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean zHasNext = it.hasNext();
                            j4 = j3;
                            f = fFloatValue;
                            if (!zHasNext) {
                                break;
                            }
                            float fFloatValue2 = ((Number) it.next()).floatValue();
                            sn4.V0(sn4Var, j4, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var.f() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(fFloatValue2)) & 4294967295L), f, 0, null, 496);
                        }
                        float f2 = f;
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            float fFloatValue3 = ((Number) it2.next()).floatValue();
                            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fFloatValue3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L);
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                            long jFloatToRawIntBits2 = Float.floatToRawIntBits(fFloatValue3);
                            sn4 sn4Var2 = sn4Var;
                            long j5 = j4;
                            float f3 = f2;
                            sn4.V0(sn4Var2, j5, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L) | (jFloatToRawIntBits2 << 32), f3, 0, null, 496);
                            j4 = j5;
                            f2 = f3;
                            sn4Var = sn4Var2;
                        }
                        return wef.a;
                    }
                });
            default:
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a(Long.valueOf(j), "duration");
                a26 a26Var = (a26) ((e89) obj2).getValue();
                if (a26Var != null) {
                    a26Var.d(l1fVar2);
                }
                return wefVar;
        }
    }

    public /* synthetic */ jf4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
