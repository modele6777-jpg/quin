package ai.askquin.ui.conversation;

import defpackage.em7;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.wn2;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public static final /* synthetic */ h a = new h();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.conversation.ConversationRoute", kobVar.b(ConversationRoute.class), new em7[]{kobVar.b(ConversationRoute.Conversation.class), kobVar.b(ConversationRoute.InvitationDialog.class)}, new xn7[]{new wn2("ai.askquin.ui.conversation.ConversationRoute.Conversation", ConversationRoute.Conversation.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.ConversationRoute.InvitationDialog", ConversationRoute.InvitationDialog.INSTANCE, new Annotation[0])}, new Annotation[0]);
    }
}
