package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xg5 {
    public static final xg5 a = new xg5();
    public static final Map b = Collections.synchronizedMap(new LinkedHashMap());

    public static vg5 a(h1d h1dVar) {
        Map map = b;
        map.getClass();
        Object obj = map.get(h1dVar);
        if (obj != null) {
            return (vg5) obj;
        }
        yg5.k(h1dVar, ". Dependencies should be added at class load time.", "Cannot get dependency ");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0065  */
    /* JADX WARN: Code duplicated, block: B:19:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0097 -> B:21:0x0098). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.zn2 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.wg5
            if (r0 == 0) goto L13
            r0 = r9
            wg5 r0 = (defpackage.wg5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            wg5 r0 = new wg5
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r8 = r0.result
            int r9 = r0.label
            r1 = 0
            r2 = 1
            if (r9 == 0) goto L3e
            if (r9 != r2) goto L38
            java.lang.Object r9 = r0.L$4
            java.lang.Object r3 = r0.L$3
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Object r4 = r0.L$2
            h1d r4 = (defpackage.h1d) r4
            java.lang.Object r5 = r0.L$1
            java.util.Iterator r5 = (java.util.Iterator) r5
            java.lang.Object r6 = r0.L$0
            java.util.Map r6 = (java.util.Map) r6
            defpackage.jzb.q(r8)
            goto L98
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r1
        L3e:
            defpackage.jzb.q(r8)
            java.util.Map r8 = defpackage.xg5.b
            r8.getClass()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            int r3 = r8.size()
            int r3 = defpackage.bm8.F(r3)
            r9.<init>(r3)
            java.util.Set r8 = r8.entrySet()
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
            r5 = r8
            r3 = r9
        L5f:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto Lb0
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r9 = r8.getKey()
            java.lang.Object r4 = r8.getKey()
            h1d r4 = (defpackage.h1d) r4
            java.lang.Object r8 = r8.getValue()
            vg5 r8 = (defpackage.vg5) r8
            uo2 r6 = new uo2
            r7 = 19
            r6.<init>(r7, r8)
            r0.L$0 = r3
            r0.L$1 = r5
            r0.L$2 = r4
            r0.L$3 = r3
            r0.L$4 = r9
            r0.label = r2
            java.lang.Object r8 = defpackage.nk8.x(r6, r0)
            bw2 r6 = defpackage.bw2.a
            if (r8 != r6) goto L97
            return r6
        L97:
            r6 = r3
        L98:
            r4.getClass()
            vg5 r8 = a(r4)
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r8 = r8.b
            if (r8 == 0) goto La8
            r3.put(r9, r8)
            r3 = r6
            goto L5f
        La8:
            java.lang.String r8 = "Subscriber "
            java.lang.String r9 = " has not been registered."
            defpackage.yg5.k(r4, r9, r8)
            return r1
        Lb0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xg5.b(zn2):java.lang.Object");
    }
}
