package ai.askquin.ui.persistence.serialization;

import defpackage.em7;
import defpackage.job;
import defpackage.kic;
import defpackage.kob;
import defpackage.wn2;
import defpackage.xn7;
import java.lang.annotation.Annotation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j {
    public static final /* synthetic */ j a = new j();

    public final xn7 serializer() {
        kob kobVar = job.a;
        return new kic("ai.askquin.ui.persistence.serialization.SerializableDivinationState", kobVar.b(SerializableDivinationState.class), new em7[]{kobVar.b(SerializableDivinationState.Analysis.class), kobVar.b(SerializableDivinationState.CardsDecided.class), kobVar.b(SerializableDivinationState.CardsExplanation.class), kobVar.b(SerializableDivinationState.DrawnCardsAwaitingQuestion.class), kobVar.b(SerializableDivinationState.WaitAdditionalInfo.class), kobVar.b(SerializableDivinationState.WaitConfirm.class), kobVar.b(SerializableDivinationState.PhotoTarot.class), kobVar.b(SerializableDivinationState.WaitQuestion.class), kobVar.b(SerializableDivinationState.WaitQuickDrawSpread.class)}, new xn7[]{d.a, f.a, h.a, new wn2("ai.askquin.ui.persistence.serialization.SerializableDivinationState.DrawnCardsAwaitingQuestion", SerializableDivinationState.DrawnCardsAwaitingQuestion.INSTANCE, new Annotation[0]), n.a, p.a, l.a, new wn2("ai.askquin.ui.persistence.serialization.SerializableDivinationState.WaitQuestion", SerializableDivinationState.WaitQuestion.INSTANCE, new Annotation[0]), r.a}, new Annotation[0]);
    }
}
