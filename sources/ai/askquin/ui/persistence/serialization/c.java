package ai.askquin.ui.persistence.serialization;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.x0;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.ev4;
import defpackage.gia;
import defpackage.hx8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.om3;
import defpackage.s8f;
import defpackage.t72;
import defpackage.w56;
import defpackage.xef;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.zf2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements w56 {
    public static final c a;
    private static final nyc descriptor;

    static {
        c cVar = new c();
        a = cVar;
        gia giaVar = new gia("ai.askquin.ui.persistence.serialization.SerializableDivination", cVar, 9);
        giaVar.k("state", false);
        giaVar.k("messages", false);
        giaVar.k("failedOperation", false);
        giaVar.k("failedReason", true);
        giaVar.k("workingOperation", false);
        giaVar.k("pendingClarifyingCards", true);
        giaVar.k("readingBlockReason", true);
        giaVar.k("drawBeforeQuestion", true);
        giaVar.k("mixedDeck", true);
        descriptor = giaVar;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        SerializableDivination serializableDivination = (SerializableDivination) obj;
        serializableDivination.getClass();
        nyc nycVar = descriptor;
        ag2 ag2VarC = ev4Var.c(nycVar);
        SerializableDivination.write$Self$Quin_conversation_gpRelease(serializableDivination, ag2VarC, nycVar);
        ag2VarC.b(nycVar);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        nyc nycVar = descriptor;
        zf2 zf2VarC = om3Var.c(nycVar);
        lw7[] lw7VarArr = SerializableDivination.$childSerializers;
        MixedDeckSnapshot mixedDeckSnapshot = null;
        boolean z = true;
        SerializableDrawBeforeQuestion serializableDrawBeforeQuestion = null;
        int i = 0;
        SerializableDivinationState serializableDivinationState = null;
        List list = null;
        Operation operation = null;
        FailReason failReason = null;
        Operation operation2 = null;
        List list2 = null;
        QuotaBlockReason quotaBlockReason = null;
        while (z) {
            int iJ = zf2VarC.j(nycVar);
            switch (iJ) {
                case -1:
                    z = false;
                    break;
                case 0:
                    serializableDivinationState = (SerializableDivinationState) zf2VarC.s(nycVar, 0, (xn7) lw7VarArr[0].getValue(), serializableDivinationState);
                    i |= 1;
                    break;
                case 1:
                    list = (List) zf2VarC.s(nycVar, 1, (xn7) lw7VarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    operation = (Operation) zf2VarC.y(nycVar, 2, Operation.Companion.serializer(xef.b), operation);
                    i |= 4;
                    break;
                case 3:
                    failReason = (FailReason) zf2VarC.y(nycVar, 3, (xn7) lw7VarArr[3].getValue(), failReason);
                    i |= 8;
                    break;
                case 4:
                    operation2 = (Operation) zf2VarC.y(nycVar, 4, Operation.Companion.serializer(xef.b), operation2);
                    i |= 16;
                    break;
                case 5:
                    list2 = (List) zf2VarC.s(nycVar, 5, (xn7) lw7VarArr[5].getValue(), list2);
                    i |= 32;
                    break;
                case 6:
                    quotaBlockReason = (QuotaBlockReason) zf2VarC.y(nycVar, 6, (xn7) lw7VarArr[6].getValue(), quotaBlockReason);
                    i |= 64;
                    break;
                case 7:
                    serializableDrawBeforeQuestion = (SerializableDrawBeforeQuestion) zf2VarC.y(nycVar, 7, t.a, serializableDrawBeforeQuestion);
                    i |= UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    break;
                case 8:
                    mixedDeckSnapshot = (MixedDeckSnapshot) zf2VarC.y(nycVar, 8, hx8.a, mixedDeckSnapshot);
                    i |= 256;
                    break;
                default:
                    s8f.f(iJ);
                    return null;
            }
        }
        zf2VarC.b(nycVar);
        return new SerializableDivination(i, serializableDivinationState, list, operation, failReason, operation2, list2, quotaBlockReason, serializableDrawBeforeQuestion, mixedDeckSnapshot, (xyc) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.w56
    public final xn7[] d() {
        lw7[] lw7VarArr = SerializableDivination.$childSerializers;
        x0 x0Var = Operation.Companion;
        xef xefVar = xef.b;
        return new xn7[]{lw7VarArr[0].getValue(), lw7VarArr[1].getValue(), t72.F(x0Var.serializer(xefVar)), t72.F((xn7) lw7VarArr[3].getValue()), t72.F(x0Var.serializer(xefVar)), lw7VarArr[5].getValue(), t72.F((xn7) lw7VarArr[6].getValue()), t72.F(t.a), t72.F(hx8.a)};
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return descriptor;
    }
}
