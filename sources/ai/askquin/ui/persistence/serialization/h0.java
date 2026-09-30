package ai.askquin.ui.persistence.serialization;

import defpackage.em7;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {
    public static final /* synthetic */ h0 a = new h0();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.persistence.serialization.SerializableMessage", kobVar.b(SerializableMessage.class), new em7[]{kobVar.b(SerializableMessage.AssistantMessage.class), kobVar.b(SerializableMessage.CardChoices.class), kobVar.b(SerializableMessage.CardExplanation.class), kobVar.b(SerializableMessage.ClarifyingCardDraw.class), kobVar.b(SerializableMessage.ClarifyingCardInterpretation.class), kobVar.b(SerializableMessage.ClarifyingCardRequest.class), kobVar.b(SerializableMessage.NewReadingRequest.class), kobVar.b(SerializableMessage.QuestionAnalysis.class), kobVar.b(SerializableMessage.QuestionDescription.class), kobVar.b(SerializableMessage.UserMessage.class)}, new xn7[]{v.a, x.a, z.a, b0.a, d0.a, f0.a, i0.a, k0.a, m0.a, o0.a}, new Annotation[0]);
    }
}
