package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rg0 implements h0e {
    public final List a;
    public final i9f b;
    public final a26 c;
    public final vz9 d;
    public boolean e = true;

    public rg0(List list, Object obj, i9f i9fVar, ta0 ta0Var, a26 a26Var, bs bsVar) {
        this.a = list;
        this.b = i9fVar;
        this.c = a26Var;
        this.d = q1c.f(obj);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x009b A[Catch: all -> 0x0038, TRY_LEAVE, TryCatch #0 {all -> 0x0038, blocks: (B:14:0x0034, B:35:0x009b, B:21:0x004d, B:23:0x0052, B:27:0x0078, B:33:0x0091), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x009b -> B:36:0x00a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object c(defpackage.zn2 r13) {
        /*
            Method dump skipped, instruction units count: 209
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rg0.c(zn2):java.lang.Object");
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return this.d.getValue();
    }
}
