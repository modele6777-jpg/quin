package defpackage;

import ai.askquin.ui.conversation.ConversationActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jo2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ConversationActivity b;

    public /* synthetic */ jo2(ConversationActivity conversationActivity, int i) {
        this.a = i;
        this.b = conversationActivity;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        ConversationActivity conversationActivity = this.b;
        int i2 = 1;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                int i3 = ConversationActivity.X0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    z7f.f(af1.b0(251544269, new jo2(conversationActivity, i2), l46Var), l46Var, 6);
                }
                break;
            default:
                int i4 = ConversationActivity.X0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    wq2.c((hod) conversationActivity.Q0.getValue(), l46Var, 8);
                    bm8.l(0, l46Var);
                }
                break;
        }
        return wefVar;
    }
}
