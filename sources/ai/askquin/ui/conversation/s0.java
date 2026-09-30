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
public final class s0 {
    public static final /* synthetic */ s0 a = new s0();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.conversation.FailReason", kobVar.b(FailReason.class), new em7[]{kobVar.b(FailReason.IllegalContent.class), kobVar.b(FailReason.Network.class), kobVar.b(FailReason.NoFreeCount.class), kobVar.b(FailReason.NoRemainingTokens.class), kobVar.b(FailReason.Unauthorized.class), kobVar.b(FailReason.UsageBlocked.class)}, new xn7[]{t0.a, new wn2("ai.askquin.ui.conversation.FailReason.Network", FailReason.Network.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.FailReason.NoFreeCount", FailReason.NoFreeCount.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.FailReason.NoRemainingTokens", FailReason.NoRemainingTokens.INSTANCE, new Annotation[0]), new wn2("ai.askquin.ui.conversation.FailReason.Unauthorized", FailReason.Unauthorized.INSTANCE, new Annotation[0]), v0.a}, new Annotation[0]);
    }
}
