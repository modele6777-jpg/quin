package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kh2 {
    public static final ig4 a = new ig4("CLOSED", 2);

    public static final Object a(rtc rtcVar, long j, l26 l26Var) {
        Unsafe unsafe;
        long j2;
        while (true) {
            rtc rtcVar2 = rtcVar;
            while (true) {
                if (rtcVar2.d >= j && !rtcVar2.d()) {
                    return rtcVar2;
                }
                Object objectVolatile = ud0.a.getObjectVolatile(rtcVar2, lh2.a);
                ig4 ig4Var = a;
                if (objectVolatile == ig4Var) {
                    return ig4Var;
                }
                rtcVar = (rtc) ((lh2) objectVolatile);
                if (rtcVar != null) {
                    break;
                }
                rtc rtcVar3 = (rtc) l26Var.z(Long.valueOf(rtcVar2.d + 1), rtcVar2);
                do {
                    unsafe = ud0.a;
                    j2 = lh2.a;
                    if (unsafe.compareAndSwapObject(rtcVar2, j2, (Object) null, rtcVar3)) {
                        if (rtcVar2.d()) {
                            rtcVar2.e();
                        }
                        rtcVar2 = rtcVar3;
                        break;
                    }
                } while (unsafe.getObjectVolatile(rtcVar2, j2) == null);
            }
        }
    }
}
