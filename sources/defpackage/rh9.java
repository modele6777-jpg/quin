package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rh9 implements d3b {
    public final Context a;
    public final gpf b;
    public final Danger c = Danger.STAGING_ONLY;
    public final List d = t72.H(new ParamSpec("action", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    public rh9(Context context, gpf gpfVar) {
        this.a = context;
        this.b = gpfVar;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.c;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (r7.equals("optin") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0069, code lost:
    
        if (r7.equals("optout") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r7.equals("opt-in") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        defpackage.bm8.P(new defpackage.ph9(r6, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008d, code lost:
    
        return new ai.askquin.qa.bridge.QaResult.Ok(new defpackage.ti7(defpackage.ib8.q("action", defpackage.oh7.c("opt-in"))));
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0092, code lost:
    
        if (r7.equals("opt-out") == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        defpackage.bm8.P(new defpackage.qh9(r6, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00bc, code lost:
    
        return new ai.askquin.qa.bridge.QaResult.Ok(new defpackage.ti7(defpackage.ib8.q("action", defpackage.oh7.c("opt-out"))));
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.d3b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ai.askquin.qa.bridge.QaResult c(defpackage.ti7 r7) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rh9.c(ti7):ai.askquin.qa.bridge.QaResult");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "notification.sync-optout";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.d;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "Opt-out 同步（pull / opt-in / opt-out）";
    }
}
