package ai.askquin.ui.persistence.serialization;

import defpackage.a26;
import defpackage.bh7;
import defpackage.e2d;
import defpackage.em7;
import defpackage.hzc;
import defpackage.job;
import defpackage.kob;
import defpackage.wef;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements a26 {
    @Override // defpackage.a26
    public final Object d(Object obj) {
        bh7 bh7Var = (bh7) obj;
        bh7Var.getClass();
        bh7Var.c = true;
        hzc hzcVar = new hzc();
        kob kobVar = job.a;
        hzcVar.e(kobVar.b(SerializableDivinationState.class), new e2d(22));
        hzcVar.e(kobVar.b(SerializableDivinationState.Patternable.class), new e2d(23));
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.WaitQuestion.class), SerializableDivinationState.WaitQuestion.INSTANCE.serializer());
        em7 em7VarB = kobVar.b(SerializableDivinationState.class);
        em7 em7VarB2 = kobVar.b(SerializableDivinationState.WaitConfirm.class);
        q qVar = SerializableDivinationState.WaitConfirm.Companion;
        hzcVar.d(em7VarB, em7VarB2, qVar.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.WaitQuickDrawSpread.class), SerializableDivinationState.WaitQuickDrawSpread.Companion.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.DrawnCardsAwaitingQuestion.class), SerializableDivinationState.DrawnCardsAwaitingQuestion.INSTANCE.serializer());
        em7 em7VarB3 = kobVar.b(SerializableDivinationState.class);
        em7 em7VarB4 = kobVar.b(SerializableDivinationState.WaitAdditionalInfo.class);
        o oVar = SerializableDivinationState.WaitAdditionalInfo.Companion;
        hzcVar.d(em7VarB3, em7VarB4, oVar.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.Analysis.class), SerializableDivinationState.Analysis.Companion.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.CardsDecided.class), SerializableDivinationState.CardsDecided.Companion.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.PhotoTarot.class), SerializableDivinationState.PhotoTarot.Companion.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.class), kobVar.b(SerializableDivinationState.CardsExplanation.class), SerializableDivinationState.CardsExplanation.Companion.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.Patternable.class), kobVar.b(SerializableDivinationState.WaitConfirm.class), qVar.serializer());
        hzcVar.d(kobVar.b(SerializableDivinationState.Patternable.class), kobVar.b(SerializableDivinationState.WaitAdditionalInfo.class), oVar.serializer());
        bh7Var.j = new hzc((HashMap) hzcVar.b, (HashMap) hzcVar.c, (HashMap) hzcVar.d, (HashMap) hzcVar.e, (HashMap) hzcVar.f, hzcVar.a);
        return wef.a;
    }
}
