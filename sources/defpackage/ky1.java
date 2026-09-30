package defpackage;

import java.util.List;
import tech.chatmind.api.ChatTextMessage;
import tech.chatmind.api.SelectedCard;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ky1 implements xn7 {
    public static final ky1 a = new ky1();
    public static final dd0 b = t72.l(SelectedCard.Companion.serializer());
    public static final pyc c = eec.o("tech.chatmind.api.ChatTextMessage", new nyc[0], new wu0(28));

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        ChatTextMessage chatTextMessage = (ChatTextMessage) obj;
        chatTextMessage.getClass();
        sh7 sh7Var = ev4Var instanceof sh7 ? (sh7) ev4Var : null;
        if (sh7Var == null) {
            throw new yyc("ChatTextMessage only supports JSON");
        }
        ui7 ui7Var = new ui7();
        ui7Var.a(oh7.c(chatTextMessage.getMessageId()), "messageId");
        ui7Var.a(oh7.c(chatTextMessage.getCreatedTime()), "createdTime");
        ui7Var.a(oh7.c(chatTextMessage.getRole()), "role");
        ui7Var.a(oh7.c(chatTextMessage.getType()), "type");
        ui7Var.a(oh7.c(chatTextMessage.getContent()), "content");
        String label = chatTextMessage.getLabel();
        if (label != null) {
            ui7Var.a(oh7.c(label), "label");
        }
        Boolean ignored = chatTextMessage.getIgnored();
        if (ignored != null) {
            jgb.d0(ui7Var, "ignored", ignored);
        }
        String drawClarifyingCardMessageId = chatTextMessage.getDrawClarifyingCardMessageId();
        if (drawClarifyingCardMessageId != null) {
            ui7Var.a(oh7.c(drawClarifyingCardMessageId), "drawClarifyingCardMessageId");
        }
        String interpretClarifyingCardMessageId = chatTextMessage.getInterpretClarifyingCardMessageId();
        if (interpretClarifyingCardMessageId != null) {
            ui7Var.a(oh7.c(interpretClarifyingCardMessageId), "interpretClarifyingCardMessageId");
        }
        List<SelectedCard> cards = chatTextMessage.getCards();
        if (cards != null) {
            ui7Var.a(sh7Var.d().c(b, cards), "cards");
        }
        String requestClarifyingCardMessageId = chatTextMessage.getRequestClarifyingCardMessageId();
        if (requestClarifyingCardMessageId != null) {
            ui7Var.a(oh7.c(requestClarifyingCardMessageId), "requestClarifyingCardMessageId");
        }
        String interpretation = chatTextMessage.getInterpretation();
        if (interpretation != null) {
            ui7Var.a(oh7.c(interpretation), "interpretation");
        }
        String question = chatTextMessage.getQuestion();
        if (question != null) {
            ui7Var.a(oh7.c(question), "question");
        }
        String tarotReadingId = chatTextMessage.getTarotReadingId();
        if (tarotReadingId != null) {
            ui7Var.a(oh7.c(tarotReadingId), "tarotReadingId");
        }
        TarotReadingHistory tarotReading = chatTextMessage.getTarotReading();
        if (tarotReading != null) {
            ui7Var.a(sh7Var.d().c(TarotReadingHistory.Companion.serializer(), tarotReading), "tarotReading");
        }
        sh7Var.z(new ti7(ui7Var.a));
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0081  */
    /* JADX WARN: Code duplicated, block: B:38:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0094  */
    /* JADX WARN: Code duplicated, block: B:42:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:66:0x0120  */
    /* JADX WARN: Code duplicated, block: B:72:0x0100 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x00bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        String strS;
        String str;
        String strS2;
        String str2;
        Object obj;
        yi7 yi7Var;
        Boolean boolB;
        nh7 nh7Var;
        Object dzbVar;
        List list;
        nh7 nh7Var2;
        Object dzbVar2;
        Object obj2 = null;
        jh7 jh7Var = om3Var instanceof jh7 ? (jh7) om3Var : null;
        if (jh7Var == null) {
            throw new yyc("ChatTextMessage only supports JSON");
        }
        nh7 nh7VarM = jh7Var.m();
        ti7 ti7Var = nh7VarM instanceof ti7 ? (ti7) nh7VarM : null;
        if (ti7Var == null) {
            return new ChatTextMessage(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
        }
        nh7 nh7Var3 = (nh7) ti7Var.get("type");
        String strS3 = d8c.s(ti7Var, "messageId");
        String str3 = strS3 == null ? "" : strS3;
        String strS4 = d8c.s(ti7Var, "createdTime");
        String str4 = strS4 == null ? "" : strS4;
        String strS5 = d8c.s(ti7Var, "role");
        String str5 = strS5 == null ? "" : strS5;
        if (nh7Var3 != null && !(nh7Var3 instanceof qi7)) {
            strS = d8c.s(ti7Var, "type");
            if (strS == null) {
                str = "";
            }
            strS2 = d8c.s(ti7Var, "content");
            if (strS2 == null) {
                str2 = "";
            } else {
                str2 = strS2;
            }
            String strS6 = d8c.s(ti7Var, "label");
            obj = ti7Var.get("ignored");
            if (obj instanceof yi7) {
                yi7Var = (yi7) obj;
            } else {
                yi7Var = null;
            }
            if (yi7Var != null) {
                e37 e37Var = oh7.a;
                boolB = n4e.b(yi7Var.c());
            } else {
                boolB = null;
            }
            String strS7 = d8c.s(ti7Var, "drawClarifyingCardMessageId");
            String strS8 = d8c.s(ti7Var, "interpretClarifyingCardMessageId");
            nh7Var = (nh7) ti7Var.get("cards");
            if (nh7Var != null) {
                try {
                    dzbVar = (List) jh7Var.d().a(b, nh7Var);
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                list = (List) dzbVar;
            } else {
                list = null;
            }
            String strS9 = d8c.s(ti7Var, "requestClarifyingCardMessageId");
            String strS10 = d8c.s(ti7Var, "interpretation");
            String strS11 = d8c.s(ti7Var, "question");
            String strS12 = d8c.s(ti7Var, "tarotReadingId");
            nh7Var2 = (nh7) ti7Var.get("tarotReading");
            if (nh7Var2 != null) {
                try {
                    dzbVar2 = (TarotReadingHistory) jh7Var.d().a(TarotReadingHistory.Companion.serializer(), nh7Var2);
                } catch (Throwable th2) {
                    dzbVar2 = new dzb(th2);
                }
                obj2 = (TarotReadingHistory) (dzbVar2 instanceof dzb ? null : dzbVar2);
            }
            return new ChatTextMessage(str3, str4, str5, str, str2, strS6, boolB, strS7, strS8, list, strS9, strS10, strS11, strS12, obj2);
        }
        strS = "text";
        str = strS;
        strS2 = d8c.s(ti7Var, "content");
        if (strS2 == null) {
            str2 = "";
        } else {
            str2 = strS2;
        }
        String strS13 = d8c.s(ti7Var, "label");
        obj = ti7Var.get("ignored");
        if (obj instanceof yi7) {
            yi7Var = (yi7) obj;
        } else {
            yi7Var = null;
        }
        if (yi7Var != null) {
            e37 e37Var2 = oh7.a;
            boolB = n4e.b(yi7Var.c());
        } else {
            boolB = null;
        }
        String strS14 = d8c.s(ti7Var, "drawClarifyingCardMessageId");
        String strS15 = d8c.s(ti7Var, "interpretClarifyingCardMessageId");
        nh7Var = (nh7) ti7Var.get("cards");
        if (nh7Var != null) {
            dzbVar = (List) jh7Var.d().a(b, nh7Var);
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            list = (List) dzbVar;
        } else {
            list = null;
        }
        String strS16 = d8c.s(ti7Var, "requestClarifyingCardMessageId");
        String strS17 = d8c.s(ti7Var, "interpretation");
        String strS18 = d8c.s(ti7Var, "question");
        String strS19 = d8c.s(ti7Var, "tarotReadingId");
        nh7Var2 = (nh7) ti7Var.get("tarotReading");
        if (nh7Var2 != null) {
            dzbVar2 = (TarotReadingHistory) jh7Var.d().a(TarotReadingHistory.Companion.serializer(), nh7Var2);
            obj2 = (TarotReadingHistory) (dzbVar2 instanceof dzb ? null : dzbVar2);
        }
        return new ChatTextMessage(str3, str4, str5, str, str2, strS13, boolB, strS14, strS15, list, strS16, strS17, strS18, strS19, obj2);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return c;
    }
}
