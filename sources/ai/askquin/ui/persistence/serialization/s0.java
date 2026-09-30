package ai.askquin.ui.persistence.serialization;

import defpackage.ad4;
import defpackage.ap;
import defpackage.bd4;
import defpackage.cd4;
import defpackage.dd4;
import defpackage.ed4;
import defpackage.f1d;
import defpackage.fd4;
import defpackage.gd4;
import defpackage.hd4;
import defpackage.id4;
import defpackage.jd4;
import defpackage.pu4;
import defpackage.s72;
import defpackage.t72;
import defpackage.zc4;
import java.util.List;
import tech.chatmind.api.PatternData;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 {
    public static final jd4 a(SerializableDivinationState serializableDivinationState) {
        if (serializableDivinationState instanceof SerializableDivinationState.WaitQuestion) {
            return hd4.a;
        }
        if (serializableDivinationState instanceof SerializableDivinationState.WaitQuickDrawSpread) {
            return new id4(((SerializableDivinationState.WaitQuickDrawSpread) serializableDivinationState).getSelectedSpreadId());
        }
        if (serializableDivinationState instanceof SerializableDivinationState.DrawnCardsAwaitingQuestion) {
            return cd4.a;
        }
        boolean z = serializableDivinationState instanceof SerializableDivinationState.WaitConfirm;
        List<String> listH = pu4.a;
        if (z) {
            SerializableDivinationState.WaitConfirm waitConfirm = (SerializableDivinationState.WaitConfirm) serializableDivinationState;
            if (waitConfirm.getEditQuestions() != null) {
                listH = waitConfirm.getEditQuestions();
            } else if (waitConfirm.getEditQuestion() != null) {
                listH = t72.H(waitConfirm.getEditQuestion());
            }
            List<String> list = listH;
            Boolean boolIsCanTarot = waitConfirm.isCanTarot();
            boolean zBooleanValue = boolIsCanTarot != null ? boolIsCanTarot.booleanValue() : true;
            Boolean boolIsSuitable = waitConfirm.isSuitable();
            boolean zBooleanValue2 = boolIsSuitable != null ? boolIsSuitable.booleanValue() : true;
            String question = waitConfirm.getQuestion();
            String suggestions = waitConfirm.getSuggestions();
            Boolean boolIsAdditionalInfoNeeded = waitConfirm.isAdditionalInfoNeeded();
            boolean zBooleanValue3 = boolIsAdditionalInfoNeeded != null ? boolIsAdditionalInfoNeeded.booleanValue() : false;
            String additionalInfoQuestion = waitConfirm.getAdditionalInfoQuestion();
            Boolean needsRevision = waitConfirm.getNeedsRevision();
            return new gd4(zBooleanValue, zBooleanValue2, list, question, suggestions, zBooleanValue3, additionalInfoQuestion, needsRevision != null ? needsRevision.booleanValue() : false);
        }
        if (serializableDivinationState instanceof SerializableDivinationState.WaitAdditionalInfo) {
            SerializableDivinationState.WaitAdditionalInfo waitAdditionalInfo = (SerializableDivinationState.WaitAdditionalInfo) serializableDivinationState;
            return new fd4((gd4) a(waitAdditionalInfo.getPrev()), waitAdditionalInfo.getAdditionalInfo());
        }
        if (serializableDivinationState instanceof SerializableDivinationState.Analysis) {
            SerializableDivinationState.Analysis analysis = (SerializableDivinationState.Analysis) serializableDivinationState;
            String question2 = analysis.getQuestion();
            String pattern = analysis.getPattern();
            List<PatternData> patternData = analysis.getPatternData();
            ed4 ed4Var = (ed4) a(analysis.getPrev());
            f1d source = analysis.getSource();
            if (source == null) {
                source = f1d.a;
            }
            return new zc4(question2, pattern, patternData, ed4Var, source, analysis.getAid(), analysis.getSpreadId());
        }
        if (serializableDivinationState instanceof SerializableDivinationState.CardsDecided) {
            SerializableDivinationState.CardsDecided cardsDecided = (SerializableDivinationState.CardsDecided) serializableDivinationState;
            return new ad4((zc4) a(cardsDecided.getAnalysis()), cardsDecided.getCards(), cardsDecided.getPostDrawAdditionalInfo(), cardsDecided.getPostDrawAudioChatId(), cardsDecided.getPostDrawAudioAssetId());
        }
        if (serializableDivinationState instanceof SerializableDivinationState.PhotoTarot) {
            return new ad4((zc4) a(((SerializableDivinationState.PhotoTarot) serializableDivinationState).getAnalysis()), listH, null, null, null);
        }
        if (serializableDivinationState instanceof SerializableDivinationState.CardsExplanation) {
            SerializableDivinationState.CardsExplanation cardsExplanation = (SerializableDivinationState.CardsExplanation) serializableDivinationState;
            return new bd4(cardsExplanation.getText(), (dd4) a(cardsExplanation.getPrev()));
        }
        ap.c();
        return null;
    }

    public static final SerializableDivinationState b(jd4 jd4Var) {
        if (jd4Var instanceof hd4) {
            return SerializableDivinationState.WaitQuestion.INSTANCE;
        }
        if (jd4Var instanceof id4) {
            return new SerializableDivinationState.WaitQuickDrawSpread(((id4) jd4Var).a);
        }
        if (jd4Var instanceof cd4) {
            return SerializableDivinationState.DrawnCardsAwaitingQuestion.INSTANCE;
        }
        if (jd4Var instanceof gd4) {
            gd4 gd4Var = (gd4) jd4Var;
            return new SerializableDivinationState.WaitConfirm(gd4Var.d, Boolean.valueOf(gd4Var.a), (String) s72.x0(gd4Var.c), gd4Var.c, Boolean.valueOf(gd4Var.b), gd4Var.e, Boolean.valueOf(gd4Var.f), gd4Var.g, Boolean.valueOf(gd4Var.h));
        }
        if (jd4Var instanceof fd4) {
            fd4 fd4Var = (fd4) jd4Var;
            SerializableDivinationState serializableDivinationStateB = b(fd4Var.a);
            serializableDivinationStateB.getClass();
            return new SerializableDivinationState.WaitAdditionalInfo((SerializableDivinationState.WaitConfirm) serializableDivinationStateB, fd4Var.b);
        }
        if (jd4Var instanceof zc4) {
            zc4 zc4Var = (zc4) jd4Var;
            String str = zc4Var.a;
            String str2 = zc4Var.b;
            List list = zc4Var.c;
            SerializableDivinationState serializableDivinationStateB2 = b(zc4Var.d);
            serializableDivinationStateB2.getClass();
            return new SerializableDivinationState.Analysis(str, str2, list, (SerializableDivinationState.Patternable) serializableDivinationStateB2, zc4Var.e, zc4Var.f, zc4Var.g);
        }
        if (jd4Var instanceof ad4) {
            ad4 ad4Var = (ad4) jd4Var;
            SerializableDivinationState serializableDivinationStateB3 = b(ad4Var.a);
            serializableDivinationStateB3.getClass();
            return new SerializableDivinationState.CardsDecided((SerializableDivinationState.Analysis) serializableDivinationStateB3, ad4Var.b, ad4Var.c, ad4Var.d, ad4Var.e);
        }
        if (jd4Var instanceof bd4) {
            bd4 bd4Var = (bd4) jd4Var;
            return new SerializableDivinationState.CardsExplanation(bd4Var.a, b(bd4Var.b));
        }
        ap.c();
        return null;
    }
}
