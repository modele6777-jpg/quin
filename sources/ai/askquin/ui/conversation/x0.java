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
public final class x0 {
    public static final /* synthetic */ x0 a = new x0();

    public final <REQ> xn7 serializer(xn7 xn7Var) {
        xn7Var.getClass();
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.conversation.Operation", kobVar.b(Operation.class), new em7[]{kobVar.b(Operation.Ask.class), kobVar.b(Operation.Chat.class), kobVar.b(Operation.Explanation.class), kobVar.b(Operation.Pattern.class), kobVar.b(Operation.SubmitAdditionalInfo.class), kobVar.b(Operation.SubmitSpread.class), kobVar.b(Operation.UpdateQuestion.class)}, new xn7[]{new wn2("ai.askquin.ui.conversation.Operation.Ask", Operation.Ask.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.Operation.Chat", Operation.Chat.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.Operation.Explanation", Operation.Explanation.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.Operation.Pattern", Operation.Pattern.INSTANCE, new Annotation[0]), y0.a, a1.a, c1.a}, new Annotation[0]);
    }
}
