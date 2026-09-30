package defpackage;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pg0 extends gxe {
    public final File b;
    public final r41 c = urg.a(Integer.MAX_VALUE, null, null, 6);
    public final SimpleDateFormat d;
    public final SimpleDateFormat e;

    public pg0(File file) {
        this.b = file;
        Locale locale = Locale.US;
        this.d = new SimpleDateFormat("yyyy-MM-dd", locale);
        this.e = new SimpleDateFormat("HH:mm:ss.SSS", locale);
        qn2 qn2Var = lw2.a;
        js3 js3Var = ga4.a;
        ynb.V(qn2Var, hr3.c, null, new mg0(this, null), 2);
    }

    @Override // defpackage.gxe
    public final void g(int i, String str, String str2, Throwable th) {
        str2.getClass();
        this.c.d(new ng0(i, System.currentTimeMillis(), str, str2));
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:18:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0059  */
    /* JADX WARN: Code duplicated, block: B:31:0x00aa A[Catch: all -> 0x00ed, TryCatch #2 {all -> 0x00ed, blocks: (B:28:0x00a0, B:29:0x00a4, B:31:0x00aa, B:32:0x00bf, B:40:0x00d6, B:45:0x00ef), top: B:59:0x00a0, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:36:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x004f -> B:19:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x004f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void k(defpackage.zn2 r12) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg0.k(zn2):void");
    }
}
