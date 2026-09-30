package defpackage;

import ai.askquin.ui.conversation.ConversationActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lo2 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationActivity b;

    public /* synthetic */ lo2(ConversationActivity conversationActivity, int i) {
        this.a = i;
        this.b = conversationActivity;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        ConversationActivity conversationActivity = this.b;
        switch (i) {
            case 0:
                return cgg.A(conversationActivity).g(job.a.b(fcb.class), null, null);
            case 1:
                return cgg.A(conversationActivity).g(job.a.b(i6a.class), null, null);
            case 2:
                return cgg.A(conversationActivity).g(job.a.b(s7.class), null, null);
            case 3:
                return cgg.A(conversationActivity).g(job.a.b(gmc.class), null, null);
            case 4:
                return z5c.G(job.a.b(hod.class), conversationActivity.g(), null, conversationActivity.e(), cgg.A(conversationActivity), null);
            case 5:
                return z5c.G(job.a.b(mma.class), conversationActivity.g(), null, conversationActivity.e(), cgg.A(conversationActivity), null);
            case 6:
                return conversationActivity.c();
            case 7:
                return conversationActivity.g();
            default:
                return conversationActivity.e();
        }
    }
}
