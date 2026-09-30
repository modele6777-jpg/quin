package ai.askquin.ui.persistence.serialization;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.persistence.query.PendingClarifyingCardSubmission;
import defpackage.ap;
import defpackage.cm4;
import defpackage.ct8;
import defpackage.dt8;
import defpackage.et8;
import defpackage.fb4;
import defpackage.ft8;
import defpackage.gt8;
import defpackage.ht8;
import defpackage.jd4;
import defpackage.jt8;
import defpackage.kt8;
import defpackage.lt8;
import defpackage.nt8;
import defpackage.ot8;
import defpackage.rs0;
import defpackage.t68;
import defpackage.t72;
import defpackage.xh7;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 {
    public final xh7 a = rs0.d(new q0());

    public final fb4 a(String str) {
        ot8 jt8Var;
        str.getClass();
        SerializableDivination serializableDivination = (SerializableDivination) this.a.b(SerializableDivination.Companion.serializer(), str);
        jd4 jd4VarA = s0.a(serializableDivination.getState());
        List<SerializableMessage> messages = serializableDivination.getMessages();
        ArrayList arrayList = new ArrayList(t72.u(messages, 10));
        Iterator<T> it = messages.iterator();
        while (true) {
            if (!it.hasNext()) {
                Operation<?> failedOperation = serializableDivination.getFailedOperation();
                FailReason failedReason = serializableDivination.getFailedReason();
                Operation<?> workingOperation = serializableDivination.getWorkingOperation();
                List<PendingClarifyingCardSubmission> pendingClarifyingCards = serializableDivination.getPendingClarifyingCards();
                QuotaBlockReason readingBlockReason = serializableDivination.getReadingBlockReason();
                SerializableDrawBeforeQuestion drawBeforeQuestion = serializableDivination.getDrawBeforeQuestion();
                cm4 origin = drawBeforeQuestion != null ? drawBeforeQuestion.toOrigin() : null;
                MixedDeckSnapshot mixedDeck = serializableDivination.getMixedDeck();
                return new fb4(jd4VarA, arrayList, failedOperation, failedReason, workingOperation, pendingClarifyingCards, readingBlockReason, origin, (mixedDeck == null || !mixedDeck.isValid()) ? null : mixedDeck);
            }
            SerializableMessage serializableMessage = (SerializableMessage) it.next();
            if (serializableMessage instanceof SerializableMessage.UserMessage) {
                SerializableMessage.UserMessage userMessage = (SerializableMessage.UserMessage) serializableMessage;
                jt8Var = new nt8(userMessage.getText(), userMessage.getId());
            } else if (serializableMessage instanceof SerializableMessage.AssistantMessage) {
                SerializableMessage.AssistantMessage assistantMessage = (SerializableMessage.AssistantMessage) serializableMessage;
                jt8Var = new ct8(assistantMessage.getText(), assistantMessage.getId());
            } else if (serializableMessage instanceof SerializableMessage.QuestionDescription) {
                jt8Var = new lt8(((SerializableMessage.QuestionDescription) serializableMessage).getText());
            } else if (serializableMessage instanceof SerializableMessage.QuestionAnalysis) {
                SerializableMessage.QuestionAnalysis questionAnalysis = (SerializableMessage.QuestionAnalysis) serializableMessage;
                jt8Var = new kt8(questionAnalysis.getId(), questionAnalysis.getText());
            } else if (serializableMessage instanceof SerializableMessage.CardChoices) {
                SerializableMessage.CardChoices cardChoices = (SerializableMessage.CardChoices) serializableMessage;
                jt8Var = new dt8(cardChoices.getQuestion(), cardChoices.getCards());
            } else if (serializableMessage instanceof SerializableMessage.CardExplanation) {
                SerializableMessage.CardExplanation cardExplanation = (SerializableMessage.CardExplanation) serializableMessage;
                jt8Var = new et8(cardExplanation.getId(), cardExplanation.getText(), cardExplanation.getFinished());
            } else if (serializableMessage instanceof SerializableMessage.ClarifyingCardRequest) {
                SerializableMessage.ClarifyingCardRequest clarifyingCardRequest = (SerializableMessage.ClarifyingCardRequest) serializableMessage;
                jt8Var = new ht8(clarifyingCardRequest.getId(), clarifyingCardRequest.getLabel(), clarifyingCardRequest.getIgnored(), clarifyingCardRequest.getDrawMessageId(), clarifyingCardRequest.getInterpretationMessageId());
            } else if (serializableMessage instanceof SerializableMessage.ClarifyingCardDraw) {
                SerializableMessage.ClarifyingCardDraw clarifyingCardDraw = (SerializableMessage.ClarifyingCardDraw) serializableMessage;
                jt8Var = new ft8(clarifyingCardDraw.getId(), clarifyingCardDraw.getCards(), clarifyingCardDraw.getRequestMessageId(), clarifyingCardDraw.getInterpretationMessageId());
            } else if (serializableMessage instanceof SerializableMessage.ClarifyingCardInterpretation) {
                SerializableMessage.ClarifyingCardInterpretation clarifyingCardInterpretation = (SerializableMessage.ClarifyingCardInterpretation) serializableMessage;
                jt8Var = new gt8(clarifyingCardInterpretation.getId(), clarifyingCardInterpretation.getText(), clarifyingCardInterpretation.getDrawMessageId(), clarifyingCardInterpretation.getRequestMessageId());
            } else {
                if (!(serializableMessage instanceof SerializableMessage.NewReadingRequest)) {
                    ap.c();
                    return null;
                }
                SerializableMessage.NewReadingRequest newReadingRequest = (SerializableMessage.NewReadingRequest) serializableMessage;
                String id = newReadingRequest.getId();
                String question = newReadingRequest.getQuestion();
                String childReadingId = newReadingRequest.getChildReadingId();
                SerializableLinkedReadingSnapshot childReading = newReadingRequest.getChildReading();
                jt8Var = new jt8(id, question, childReadingId, childReading != null ? new t68(childReading.getId(), childReading.getQuestion(), childReading.getContent()) : null);
            }
            arrayList.add(jt8Var);
        }
    }

    public final String b(fb4 fb4Var) {
        SerializableDrawBeforeQuestion serializableDrawBeforeQuestion;
        Object newReadingRequest;
        fb4Var.getClass();
        List list = fb4Var.b;
        SerializableDivinationState serializableDivinationStateB = s0.b(fb4Var.a);
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Operation operation = fb4Var.c;
                FailReason failReason = fb4Var.d;
                Operation operation2 = fb4Var.e;
                List list2 = fb4Var.f;
                QuotaBlockReason quotaBlockReason = fb4Var.g;
                cm4 cm4Var = fb4Var.h;
                if (cm4Var != null) {
                    String strName = cm4Var.a.name();
                    String str = cm4Var.b;
                    List list3 = cm4Var.c;
                    List list4 = cm4Var.d;
                    Instant instant = cm4Var.e;
                    serializableDrawBeforeQuestion = new SerializableDrawBeforeQuestion(strName, str, list3, list4, instant != null ? instant.toString() : null);
                } else {
                    serializableDrawBeforeQuestion = null;
                }
                return this.a.d(SerializableDivination.Companion.serializer(), new SerializableDivination(serializableDivinationStateB, arrayList, operation, failReason, operation2, list2, quotaBlockReason, serializableDrawBeforeQuestion, fb4Var.i));
            }
            ot8 ot8Var = (ot8) it.next();
            if (ot8Var instanceof nt8) {
                nt8 nt8Var = (nt8) ot8Var;
                newReadingRequest = new SerializableMessage.UserMessage(nt8Var.a, nt8Var.b);
            } else if (ot8Var instanceof ct8) {
                ct8 ct8Var = (ct8) ot8Var;
                newReadingRequest = new SerializableMessage.AssistantMessage(ct8Var.a, ct8Var.b);
            } else if (ot8Var instanceof lt8) {
                newReadingRequest = new SerializableMessage.QuestionDescription(((lt8) ot8Var).a);
            } else if (ot8Var instanceof kt8) {
                kt8 kt8Var = (kt8) ot8Var;
                newReadingRequest = new SerializableMessage.QuestionAnalysis(kt8Var.a, kt8Var.b);
            } else if (ot8Var instanceof dt8) {
                dt8 dt8Var = (dt8) ot8Var;
                newReadingRequest = new SerializableMessage.CardChoices(dt8Var.a, dt8Var.b);
            } else if (ot8Var instanceof et8) {
                et8 et8Var = (et8) ot8Var;
                newReadingRequest = new SerializableMessage.CardExplanation(et8Var.a, et8Var.b, et8Var.c);
            } else if (ot8Var instanceof ht8) {
                ht8 ht8Var = (ht8) ot8Var;
                newReadingRequest = new SerializableMessage.ClarifyingCardRequest(ht8Var.a, ht8Var.b, ht8Var.c, ht8Var.d, ht8Var.e);
            } else if (ot8Var instanceof ft8) {
                ft8 ft8Var = (ft8) ot8Var;
                newReadingRequest = new SerializableMessage.ClarifyingCardDraw(ft8Var.a, ft8Var.b, ft8Var.c, ft8Var.d);
            } else if (ot8Var instanceof gt8) {
                gt8 gt8Var = (gt8) ot8Var;
                newReadingRequest = new SerializableMessage.ClarifyingCardInterpretation(gt8Var.a, gt8Var.b, gt8Var.c, gt8Var.d);
            } else {
                if (!(ot8Var instanceof jt8)) {
                    ap.c();
                    return null;
                }
                jt8 jt8Var = (jt8) ot8Var;
                String str2 = jt8Var.a;
                String str3 = jt8Var.b;
                String str4 = jt8Var.c;
                t68 t68Var = jt8Var.d;
                newReadingRequest = new SerializableMessage.NewReadingRequest(str2, str3, str4, t68Var != null ? new SerializableLinkedReadingSnapshot(t68Var.a, t68Var.b, t68Var.c) : null);
            }
            arrayList.add(newReadingRequest);
        }
    }
}
