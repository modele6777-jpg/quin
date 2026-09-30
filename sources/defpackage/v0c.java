package defpackage;

import ai.askquin.model.reviewreward.ReviewRewardState;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v0c implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;

    public /* synthetic */ v0c(p1c p1cVar, String str, long j) {
        this.a = 0;
        this.c = str;
        this.b = j;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        int i = this.a;
        String str = this.c;
        long j = this.b;
        switch (i) {
            case 0:
                ((ReviewRewardState) obj).getClass();
                return new ReviewRewardState(0, (w57) null, false, false, false, (String) null, (Long) null, 0, 255, (rp3) null).recordPromptImpression().prepareStoreLaunch().recordStoreLaunched().claimSnackbarExposure(str, j);
            case 1:
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                x8c x8cVarW0 = q8cVar.W0("UPDATE workspec SET schedule_requested_at=? WHERE id=?");
                try {
                    x8cVarW0.m(1, j);
                    x8cVarW0.Q(2, str);
                    x8cVarW0.R0();
                    return Integer.valueOf(r8c.h(q8cVar));
                } finally {
                    x8cVarW0.close();
                }
            default:
                q8c q8cVar2 = (q8c) obj;
                q8cVar2.getClass();
                x8c x8cVarW1 = q8cVar2.W0("UPDATE workspec SET last_enqueue_time=? WHERE id=?");
                try {
                    x8cVarW1.m(1, j);
                    x8cVarW1.Q(2, str);
                    x8cVarW1.R0();
                    return wef.a;
                } finally {
                    x8cVarW1.close();
                }
        }
    }

    public /* synthetic */ v0c(int i, long j, String str) {
        this.a = i;
        this.b = j;
        this.c = str;
    }
}
