package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class akb implements d3b {
    public final gd8 a;
    public final e3b b;
    public final List c = t72.I(new ParamSpec("kind", ParamType.STRING, true, (nh7) null, 8, (rp3) null), new ParamSpec("count", ParamType.INT, false, oh7.b(1)));

    public akb(gd8 gd8Var, e3b e3bVar) {
        this.a = gd8Var;
        this.b = e3bVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005a, code lost:
    
        if (r1.equals("daily") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0064, code lost:
    
        if (r1.equals("div") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r1.equals("fortune") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0070, code lost:
    
        r11 = defpackage.e3b.a(r10.b).toLocalDate();
        r7 = new defpackage.x67(r4 - 1, 0, -1);
        r2 = new java.util.ArrayList(defpackage.t72.u(r7, 10));
        r7 = r7.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0095, code lost:
    
        if (((defpackage.y67) r7).c == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0097, code lost:
    
        r2.add(r11.minusDays(((defpackage.q67) r7).nextInt()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a7, code lost:
    
        defpackage.bm8.P(new defpackage.zjb(r2, r10, r11, null));
        r10 = new java.util.ArrayList(defpackage.t72.u(r2, 10));
        r11 = r2.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c0, code lost:
    
        if (r11.hasNext() == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c2, code lost:
    
        r10.add(((java.time.LocalDate) r11.next()).toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00d6, code lost:
    
        if (r1.equals("divination") == false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e6, code lost:
    
        defpackage.bm8.P(new defpackage.yjb(r4, r10, null));
        r10 = defpackage.pu4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f0, code lost:
    
        r1 = new defpackage.iy9("kind", defpackage.oh7.c(r1));
        r0 = new defpackage.iy9("count", defpackage.oh7.b(java.lang.Integer.valueOf(r4)));
        r11 = new java.util.ArrayList(defpackage.t72.u(r10, 10));
        r10 = r10.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0117, code lost:
    
        if (r10.hasNext() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0119, code lost:
    
        r11.add(defpackage.oh7.c((java.lang.String) r10.next()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0145, code lost:
    
        return new ai.askquin.qa.bridge.QaResult.Ok(new defpackage.ti7(defpackage.bm8.H(r1, r0, new defpackage.iy9("dates", new defpackage.yg7(r11)))));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [pu4] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Iterable] */
    @Override // defpackage.d3b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.askquin.qa.bridge.QaResult c(defpackage.ti7 r11) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akb.c(ti7):ai.askquin.qa.bridge.QaResult");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "data.record-completion";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "记录占卜/今日运势完成（kind=divination|daily, count）";
    }
}
