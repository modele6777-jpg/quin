package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.FailReason;
import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.PhysicalDeckReading;
import ai.askquin.ui.conversation.SceneTarot;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.persistence.query.PendingClarifyingCardSubmission;
import android.content.Context;
import android.graphics.PointF;
import androidx.work.WorkerParameters;
import com.adjust.sdk.sig.r3;
import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import tech.chatmind.api.AdditionalInfoAudio;
import tech.chatmind.api.AiRecommendResponse;
import tech.chatmind.api.ChatTextMessage;
import tech.chatmind.api.CloudMixedDeckSnapshot;
import tech.chatmind.api.GeneratedSpreadPosition;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SelectedCard;
import tech.chatmind.api.SpreadDetail;
import tech.chatmind.api.SpreadDetailCard;
import tech.chatmind.api.SpreadDetailPattern;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.TarotReadingAdditionalInfo;
import tech.chatmind.api.TarotReadingBody;
import tech.chatmind.api.TarotReadingChatState;
import tech.chatmind.api.TarotReadingHistory;
import tech.chatmind.api.TarotReadingMetadata;
import tech.chatmind.api.TarotReadingQuestionHistory;
import tech.chatmind.api.TarotReadingSpreadHistory;
import tech.chatmind.api.UserSelectedSpread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class af8 implements fg, goe, cu2, bc2, yrf, ov2, m23, qsd, t6e, qkf {
    public static final af8 M0;
    public static final af8 N0;
    public static final af8 O0;
    public static final af8 P0;
    public static final af8 Q0;
    public static final af8 R0;
    public static hr7 Z;
    public static af8 b;
    public final /* synthetic */ int a;
    public static final af8 c = new af8(1);
    public static final af8 d = new af8(2);
    public static final af8 e = new af8(3);
    public static final af8 f = new af8(4);
    public static final af8 g = new af8(5);
    public static final af8 v = new af8(9);
    public static final af8 w = new af8(10);
    public static final /* synthetic */ af8 x = new af8(11);
    public static final af8 y = new af8(12);
    public static final af8 z = new af8(13);
    public static final af8 X = new af8(14);
    public static final af8 Y = new af8(15);
    public static final /* synthetic */ af8 E0 = new af8(16);
    public static final af8 F0 = new af8(18);
    public static final af8 G0 = new af8(19);
    public static final af8 H0 = new af8(20);
    public static final af8 I0 = new af8(21);
    public static final af8 J0 = new af8(22);
    public static final af8 K0 = new af8(23);
    public static final af8 L0 = new af8(24);
    public static final af8 S0 = new af8(26);
    public static final af8 T0 = new af8(27);
    public static final af8 U0 = new af8(28);

    static {
        int i = 25;
        M0 = new af8(i);
        N0 = new af8(i);
        O0 = new af8(i);
        P0 = new af8(i);
        Q0 = new af8(i);
        R0 = new af8(i);
    }

    public /* synthetic */ af8(int i) {
        this.a = i;
    }

    public static String A(ym7 ym7Var) throws IOException {
        StringBuilder sb = new StringBuilder();
        h(sb, ym7Var);
        sb.append("fun ");
        j(sb, ym7Var);
        i(ym7Var.getName(), sb);
        s72.C0(mh3.J(ym7Var), sb, ", ", "(", ")", d5a.E0, 48);
        sb.append(": ");
        sb.append(C(ym7Var.getReturnType(), false));
        return sb.toString();
    }

    public static void B(StringBuilder sb, em7 em7Var, ex5 ex5Var, List list, boolean z2, boolean z3) throws IOException {
        StringBuilder sb2;
        boolean z4;
        if (em7Var.getTypeParameters().size() >= list.size() || af1.R(em7Var).getDeclaringClass() == null) {
            sb2 = sb;
            z4 = z3;
            sb2.append(rxg.P(ex5Var));
        } else {
            Class<?> declaringClass = af1.R(em7Var).getDeclaringClass();
            declaringClass.getClass();
            sb2 = sb;
            z4 = z3;
            B(sb2, job.a.b(declaringClass), ex5Var.e(), s72.r0(list, em7Var.getTypeParameters().size()), false, z4);
            sb2.append(".");
            sb2.append(rxg.Q(ex5Var.g()));
        }
        E(sb2, s72.c1(list, em7Var.getTypeParameters().size()), z2, z4);
    }

    public static String C(yn7 yn7Var, boolean z2) throws IOException {
        ex5 ex5Var;
        yn7Var.getClass();
        j2 j2Var = (j2) yn7Var;
        int i = 1;
        if (j2Var.u()) {
            j2 j2VarY = j2Var.y();
            j2VarY.getClass();
            return C(j2VarY, true);
        }
        j2 j2VarY2 = j2Var.y();
        j2 j2VarF = j2Var.F();
        if (j2VarY2 != null && j2VarF != null) {
            String strD = D(j2VarY2);
            String strD2 = D(j2VarF);
            if (pa7.t(strD, c5e.A(strD2, "?", ""))) {
                return c5e.A(strD2, "?", "!");
            }
            int i2 = 0;
            if (c5e.u(strD2, "?", false)) {
                if ((strD + '?').equals(strD2)) {
                    return strD + '!';
                }
            }
            if (("(" + strD + ")?").equals(strD2)) {
                return ib8.j("(", strD, ")!");
            }
            String strK = jrb.k(strD, strD2, new oob(strD, i2), new oob(strD, i), d5a.N0);
            if (strK != null) {
                return strK;
            }
            return "(" + strD + ".." + strD2 + ')';
        }
        StringBuilder sb = new StringBuilder();
        yn7 yn7VarD = j2Var.d();
        if (yn7VarD != null) {
            sb.append(yn7VarD);
            sb.append(" /* = ");
        }
        um7 um7VarB = yn7Var.B();
        if (um7VarB instanceof ao7) {
            i(((ao7) um7VarB).c, sb);
            if (yn7Var.o()) {
                sb.append("?");
            } else if (j2Var.m()) {
                sb.append(" & Any");
            }
        } else if (um7VarB instanceof em7) {
            em7 em7Var = (em7) um7VarB;
            if (j2Var.t()) {
                ex5Var = syd.b;
            } else {
                em7 em7VarF = j2Var.f();
                if (em7VarF == null) {
                    em7VarF = em7Var;
                }
                String strG = em7VarF.g();
                ex5Var = strG != null ? new ex5(strG) : null;
            }
            if (ex5Var == null) {
                ex5Var = new ex5(((nm7) em7Var).b.getName());
            }
            if (ex5Var.h(tyd.j) && pa7.t(oa7.M(ex5Var), i36.d) && !yn7Var.A().contains(do7.c)) {
                if (j2Var.o()) {
                    sb.append("(");
                }
                if (j2Var.w()) {
                    sb.append("suspend ");
                }
                s72.C0(s72.s0(1, j2Var.A()), sb, null, "(", ") -> ", null, 114);
                sb.append(s72.F0(j2Var.A()));
                if (j2Var.o()) {
                    sb.append(")?");
                }
            } else {
                B(sb, em7Var, ex5Var, yn7Var.A(), yn7Var.o(), z2);
            }
        } else if (um7VarB instanceof zn7) {
            ex5 ex5Var2 = ((zn7) um7VarB).a.a;
            ex5Var2.getClass();
            s72.C0(ex5.f(ex5Var2), sb, ".", null, null, d5a.G0, 60);
            sb = sb;
            E(sb, yn7Var.A(), yn7Var.o(), z2);
        } else {
            sb.append("???");
        }
        if (j2Var.d() != null) {
            sb.append(" */");
        }
        return sb.toString();
    }

    public static /* synthetic */ String D(yn7 yn7Var) {
        return C(yn7Var, false);
    }

    public static void E(StringBuilder sb, List list, boolean z2, boolean z3) throws IOException {
        StringBuilder sb2;
        if (list.isEmpty()) {
            sb2 = sb;
        } else {
            sb2 = sb;
            s72.C0(list, sb2, null, "<", ">", new nob(z3), 50);
        }
        if (z2) {
            sb2.append("?");
        }
    }

    public static TarotCardType F(String str) {
        Object next;
        Iterator<E> it = TarotCardType.getEntries().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (c5e.v(((TarotCardType) next).getCardKey(), str, true)) {
                return (TarotCardType) next;
            }
        }
        next = null;
        return (TarotCardType) next;
    }

    public static x6b H(TarotReadingHistory tarotReadingHistory, Instant instant, x6b x6bVar) {
        SelectedCard selectedCard;
        String str;
        String str2;
        tarotReadingHistory.getClass();
        TarotReadingBody reading = tarotReadingHistory.getReading();
        if (reading == null || (selectedCard = (SelectedCard) s72.x0(reading.getUserSelectedCards())) == null) {
            return null;
        }
        Instant instantZ = z(reading.getCreatedTime());
        if (instantZ == null && (instantZ = z(tarotReadingHistory.getCreatedTime())) == null) {
            instantZ = Instant.now();
        }
        Instant instant2 = instantZ;
        long j = x6bVar != null ? x6bVar.a : 0L;
        String key = selectedCard.getKey();
        boolean z2 = selectedCard.getDirection() == 0;
        String str3 = (x6bVar == null || (str2 = x6bVar.d) == null) ? "" : str2;
        String str4 = (x6bVar == null || (str = x6bVar.e) == null) ? "" : str;
        String content = reading.getContent();
        instant2.getClass();
        return new x6b(j, key, z2, str3, str4, content, instant2, k99.J(tarotReadingHistory.getChatId()), instant, null, 512);
    }

    public static void h(StringBuilder sb, cm7 cm7Var) throws IOException {
        List parameters = cm7Var.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((aob) obj).t() == on7.b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        s72.C0(arrayList, sb, null, "context(", ") ", d5a.Z, 50);
    }

    public static void i(String str, StringBuilder sb) {
        sb.append(rxg.Q(t99.e(str)));
    }

    public static void j(StringBuilder sb, cm7 cm7Var) {
        List listA = ((wnb) cm7Var).a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listA) {
            aob aobVar = (aob) obj;
            if (aobVar.t() == on7.a || aobVar.t() == on7.c) {
                arrayList.add(obj);
            }
        }
        aob aobVar2 = (aob) s72.y0(0, arrayList);
        if (aobVar2 != null) {
            sb.append(C(aobVar2.u(), false));
            sb.append(".");
        }
        aob aobVar3 = (aob) s72.y0(1, arrayList);
        if (aobVar3 != null) {
            sb.append("(");
            sb.append(C(aobVar3.u(), false));
            sb.append(".");
            sb.append(")");
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x0132  */
    /* JADX WARN: Code duplicated, block: B:112:0x0135  */
    /* JADX WARN: Code duplicated, block: B:113:0x0138  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:117:0x0158  */
    /* JADX WARN: Code duplicated, block: B:120:0x015f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0164  */
    /* JADX WARN: Code duplicated, block: B:124:0x016d  */
    /* JADX WARN: Code duplicated, block: B:127:0x0182  */
    /* JADX WARN: Code duplicated, block: B:135:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:153:0x0205  */
    /* JADX WARN: Code duplicated, block: B:154:0x0207  */
    /* JADX WARN: Code duplicated, block: B:157:0x020f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:158:0x0211  */
    /* JADX WARN: Code duplicated, block: B:159:0x0216  */
    /* JADX WARN: Code duplicated, block: B:164:0x0220  */
    /* JADX WARN: Code duplicated, block: B:168:0x0228  */
    /* JADX WARN: Code duplicated, block: B:175:0x023d A[PHI: r5
  0x023d: PHI (r5v30 java.lang.String) = (r5v28 java.lang.String), (r5v37 java.lang.String) binds: [B:185:0x025b, B:174:0x023c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:186:0x025d  */
    /* JADX WARN: Code duplicated, block: B:188:0x0263  */
    /* JADX WARN: Code duplicated, block: B:189:0x0268  */
    /* JADX WARN: Code duplicated, block: B:18:0x0023  */
    /* JADX WARN: Code duplicated, block: B:192:0x026f  */
    /* JADX WARN: Code duplicated, block: B:194:0x0275  */
    /* JADX WARN: Code duplicated, block: B:195:0x027a  */
    /* JADX WARN: Code duplicated, block: B:197:0x027d  */
    /* JADX WARN: Code duplicated, block: B:199:0x0283  */
    /* JADX WARN: Code duplicated, block: B:200:0x0288  */
    /* JADX WARN: Code duplicated, block: B:202:0x028b  */
    /* JADX WARN: Code duplicated, block: B:205:0x0294  */
    /* JADX WARN: Code duplicated, block: B:207:0x029e  */
    /* JADX WARN: Code duplicated, block: B:20:0x002d  */
    /* JADX WARN: Code duplicated, block: B:211:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:225:0x032d  */
    /* JADX WARN: Code duplicated, block: B:229:0x0337  */
    /* JADX WARN: Code duplicated, block: B:234:0x034e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0358  */
    /* JADX WARN: Code duplicated, block: B:237:0x035c  */
    /* JADX WARN: Code duplicated, block: B:239:0x0362  */
    /* JADX WARN: Code duplicated, block: B:240:0x0367  */
    /* JADX WARN: Code duplicated, block: B:242:0x036a  */
    /* JADX WARN: Code duplicated, block: B:250:0x037b A[PHI: r2
  0x037b: PHI (r2v77 java.lang.String) = (r2v69 java.lang.String), (r2v70 java.lang.String), (r2v79 java.lang.String) binds: [B:258:0x038b, B:260:0x038f, B:248:0x0378] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:251:0x037e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x0380  */
    /* JADX WARN: Code duplicated, block: B:255:0x0387  */
    /* JADX WARN: Code duplicated, block: B:257:0x038a  */
    /* JADX WARN: Code duplicated, block: B:259:0x038d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:260:0x038f  */
    /* JADX WARN: Code duplicated, block: B:261:0x0392  */
    /* JADX WARN: Code duplicated, block: B:263:0x0396  */
    /* JADX WARN: Code duplicated, block: B:266:0x039f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:267:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:268:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:270:0x03aa  */
    /* JADX WARN: Code duplicated, block: B:274:0x03b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:275:0x03b6  */
    /* JADX WARN: Code duplicated, block: B:276:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:279:0x03c4  */
    /* JADX WARN: Code duplicated, block: B:280:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:282:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:287:0x03dd  */
    /* JADX WARN: Code duplicated, block: B:296:0x03fd  */
    /* JADX WARN: Code duplicated, block: B:299:0x0404  */
    /* JADX WARN: Code duplicated, block: B:301:0x040a  */
    /* JADX WARN: Code duplicated, block: B:302:0x040f  */
    /* JADX WARN: Code duplicated, block: B:306:0x0418 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:307:0x041a  */
    /* JADX WARN: Code duplicated, block: B:310:0x0421 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:315:0x042c  */
    /* JADX WARN: Code duplicated, block: B:316:0x0437  */
    /* JADX WARN: Code duplicated, block: B:318:0x043a  */
    /* JADX WARN: Code duplicated, block: B:319:0x043c  */
    /* JADX WARN: Code duplicated, block: B:322:0x0444  */
    /* JADX WARN: Code duplicated, block: B:323:0x0449  */
    /* JADX WARN: Code duplicated, block: B:327:0x0456  */
    /* JADX WARN: Code duplicated, block: B:333:0x0467  */
    /* JADX WARN: Code duplicated, block: B:340:0x0474  */
    /* JADX WARN: Code duplicated, block: B:342:0x0477  */
    /* JADX WARN: Code duplicated, block: B:344:0x047a  */
    /* JADX WARN: Code duplicated, block: B:345:0x047d  */
    /* JADX WARN: Code duplicated, block: B:348:0x0482  */
    /* JADX WARN: Code duplicated, block: B:351:0x0490  */
    /* JADX WARN: Code duplicated, block: B:352:0x0495  */
    /* JADX WARN: Code duplicated, block: B:360:0x04b2  */
    /* JADX WARN: Code duplicated, block: B:361:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:370:0x04de  */
    /* JADX WARN: Code duplicated, block: B:375:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:379:0x0508 A[LOOP:2: B:377:0x0502->B:379:0x0508, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:382:0x051d  */
    /* JADX WARN: Code duplicated, block: B:383:0x0522  */
    /* JADX WARN: Code duplicated, block: B:385:0x0526  */
    /* JADX WARN: Code duplicated, block: B:389:0x053e  */
    /* JADX WARN: Code duplicated, block: B:391:0x0548  */
    /* JADX WARN: Code duplicated, block: B:398:0x0567  */
    /* JADX WARN: Code duplicated, block: B:404:0x0573  */
    /* JADX WARN: Code duplicated, block: B:408:0x0589  */
    /* JADX WARN: Code duplicated, block: B:409:0x059f  */
    /* JADX WARN: Code duplicated, block: B:413:0x05c5  */
    /* JADX WARN: Code duplicated, block: B:415:0x05c9  */
    /* JADX WARN: Code duplicated, block: B:417:0x05cf  */
    /* JADX WARN: Code duplicated, block: B:418:0x05d2  */
    /* JADX WARN: Code duplicated, block: B:420:0x05d6  */
    /* JADX WARN: Code duplicated, block: B:421:0x05db  */
    /* JADX WARN: Code duplicated, block: B:424:0x05e1  */
    /* JADX WARN: Code duplicated, block: B:425:0x05e3  */
    /* JADX WARN: Code duplicated, block: B:428:0x05eb  */
    /* JADX WARN: Code duplicated, block: B:429:0x05f0  */
    /* JADX WARN: Code duplicated, block: B:431:0x05f4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:432:0x05f6  */
    /* JADX WARN: Code duplicated, block: B:433:0x05f9  */
    /* JADX WARN: Code duplicated, block: B:435:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:436:0x0600  */
    /* JADX WARN: Code duplicated, block: B:437:0x0602 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:438:0x0604  */
    /* JADX WARN: Code duplicated, block: B:439:0x0607  */
    /* JADX WARN: Code duplicated, block: B:441:0x060b  */
    /* JADX WARN: Code duplicated, block: B:442:0x060e  */
    /* JADX WARN: Code duplicated, block: B:446:0x061e  */
    /* JADX WARN: Code duplicated, block: B:448:0x0633  */
    /* JADX WARN: Code duplicated, block: B:449:0x0636  */
    /* JADX WARN: Code duplicated, block: B:457:0x0654  */
    /* JADX WARN: Code duplicated, block: B:459:0x0661  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:460:0x0664  */
    /* JADX WARN: Code duplicated, block: B:468:0x0679  */
    /* JADX WARN: Code duplicated, block: B:493:0x06e4  */
    /* JADX WARN: Code duplicated, block: B:494:0x06e9  */
    /* JADX WARN: Code duplicated, block: B:497:0x06f1  */
    /* JADX WARN: Code duplicated, block: B:509:0x0727  */
    /* JADX WARN: Code duplicated, block: B:511:0x072d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:512:0x072f  */
    /* JADX WARN: Code duplicated, block: B:513:0x0731 A[PHI: r5
  0x0731: PHI (r5v12 java.lang.Object) = (r5v11 java.lang.Object), (r5v22 java.lang.Object) binds: [B:510:0x072b, B:512:0x072f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:514:0x0734  */
    /* JADX WARN: Code duplicated, block: B:516:0x0738  */
    /* JADX WARN: Code duplicated, block: B:517:0x073d  */
    /* JADX WARN: Code duplicated, block: B:519:0x0741 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:520:0x0743  */
    /* JADX WARN: Code duplicated, block: B:521:0x0748  */
    /* JADX WARN: Code duplicated, block: B:522:0x074b  */
    /* JADX WARN: Code duplicated, block: B:524:0x074f  */
    /* JADX WARN: Code duplicated, block: B:525:0x0754  */
    /* JADX WARN: Code duplicated, block: B:539:0x0777 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:540:0x0779  */
    /* JADX WARN: Code duplicated, block: B:541:0x077c  */
    /* JADX WARN: Code duplicated, block: B:543:0x0780  */
    /* JADX WARN: Code duplicated, block: B:544:0x0785  */
    /* JADX WARN: Code duplicated, block: B:546:0x0789  */
    /* JADX WARN: Code duplicated, block: B:547:0x078e  */
    /* JADX WARN: Code duplicated, block: B:549:0x0792 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:550:0x0794  */
    /* JADX WARN: Code duplicated, block: B:551:0x0799  */
    /* JADX WARN: Code duplicated, block: B:552:0x079c  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:560:0x04e6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:562:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:569:0x063c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:572:0x0618 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [ai.askquin.data.QuotaBlockReason] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [jd4] */
    /* JADX WARN: Type inference failed for: r1v69 */
    /* JADX WARN: Type inference failed for: r1v70 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r22v1 */
    /* JADX WARN: Type inference failed for: r22v2, types: [ai.askquin.ui.conversation.SceneTarot] */
    /* JADX WARN: Type inference failed for: r22v3 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [ai.askquin.ui.persistence.database.InterruptedDrawing] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r27v0 */
    /* JADX WARN: Type inference failed for: r27v1, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1, types: [java.time.Instant] */
    /* JADX WARN: Type inference failed for: r29v2 */
    /* JADX WARN: Type inference failed for: r2v114 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v45, types: [ai.askquin.ui.conversation.FailReason$UsageBlocked] */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [ai.askquin.ui.conversation.PhysicalDeckReading] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r31v3 */
    /* JADX WARN: Type inference failed for: r4v14, types: [hd4] */
    /* JADX WARN: Type inference failed for: r4v15, types: [jd4] */
    /* JADX WARN: Type inference failed for: r4v16, types: [jd4] */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [dd4] */
    /* JADX WARN: Type inference failed for: r4v30 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v37 */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r5v41 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [ai.askquin.ui.conversation.SceneTarot] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v18, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    public static yc4 l(TarotReadingHistory tarotReadingHistory, Instant instant, yc4 yc4Var) throws IOException {
        Instant instantZ;
        Instant instantZ2;
        TarotReadingQuestionHistory question;
        TarotReadingChatState chat;
        String content;
        List<ChatTextMessage> messages;
        Object next;
        String str;
        fb4 fb4Var;
        TarotReadingMetadata metadata;
        MixedDeckSnapshot mixedDeckSnapshot;
        MixedDeckSnapshot mixedDeckSnapshotW;
        jd4 jd4Var;
        TarotReadingQuestionHistory question2;
        TarotReadingSpreadHistory spread;
        TarotReadingBody reading;
        String strJ;
        TarotReadingAdditionalInfo additionalInfo;
        String additionalQuestionTextInfo;
        TarotReadingAdditionalInfo additionalInfo2;
        String additionalReadingTextInfo;
        ad4 ad4VarM;
        String str2;
        String str3;
        boolean z2;
        boolean z3;
        ?? ad4Var;
        ?? r1;
        TarotReadingQuestionHistory question3;
        boolean z4;
        boolean z5;
        boolean z6;
        List<ChatTextMessage> list;
        pu4 pu4Var;
        String str4;
        ArrayList arrayList;
        TarotReadingQuestionHistory question4;
        String suggestions;
        TarotReadingBody reading2;
        String content2;
        ArrayList arrayList2;
        int iF;
        LinkedHashMap linkedHashMap;
        TarotReadingChatState chat2;
        List<ChatTextMessage> messages2;
        ArrayList arrayList3;
        Iterator it;
        boolean z7;
        pu4 pu4Var2;
        pp5 pp5VarA;
        Object reason;
        ?? r10;
        TarotReadingChatState chat3;
        List<ChatTextMessage> messages3;
        List<ChatTextMessage> list2;
        List<ChatTextMessage> list3;
        ArrayList arrayList4;
        ?? r9;
        t12 t12Var;
        Object obj;
        boolean z8;
        fb4 fb4Var2;
        ?? r5;
        TarotReadingMetadata metadata2;
        Object sceneTarot;
        TarotReadingMetadata metadata3;
        String divinationType;
        TarotReadingSpreadHistory spread2;
        List listU;
        Object physicalDeckReading;
        ?? r22;
        ?? r23;
        String str5;
        String str6;
        TarotReadingSpreadHistory spread3;
        List<SpreadRecommendationResult> list4;
        List<SpreadRecommendationResult> spreads;
        ?? r27;
        ?? r29;
        ?? r31;
        AiRecommendResponse aiRecommendedSpreads;
        String scenarioId;
        TarotReadingSpreadHistory spread4;
        String spreadId;
        Object obj2;
        FailReason failReason;
        ?? r2;
        FailReason.UsageBlocked usageBlocked;
        ot8 jt8Var;
        Iterator it2;
        boolean z9;
        boolean z10;
        pu4 pu4Var3;
        jt8 jt8Var2;
        String str7;
        String str8;
        jt8 jt8Var3;
        t68 t68Var;
        String str9;
        TarotReadingBody reading3;
        String content3;
        boolean zT;
        String strJ2;
        String userQuestion;
        jd4 jd4Var2;
        boolean zIsCanTarot;
        Boolean boolIsAdditionalInfoNeeded;
        boolean zBooleanValue;
        Boolean needsRevision;
        boolean zBooleanValue2;
        gd4 gd4Var;
        TarotReadingMetadata metadata4;
        String scenarioId2;
        boolean z11;
        ed4 ed4VarB;
        TarotReadingMetadata metadata5;
        String divinationType2;
        TarotReadingBody reading4;
        String content4;
        zc4 zc4Var;
        List listU2;
        TarotReadingAdditionalInfo additionalInfo3;
        AdditionalInfoAudio additionalReadingAudioInfo;
        String transcription;
        String str10;
        String str11;
        String str12;
        String content5;
        List listW;
        zc4 zc4Var2;
        UserSelectedSpread userSelectedSpread;
        String spreadId2;
        TarotReadingMetadata metadata6;
        String scenarioId3;
        String content6;
        TarotReadingMetadata metadata7;
        String divinationType3;
        String str13;
        CloudMixedDeckSnapshot mixedDeckSnapshot2;
        fb4 fb4Var3;
        tarotReadingHistory.getClass();
        cm4 cm4Var = (yc4Var == null || (fb4Var3 = yc4Var.h) == null) ? null : fb4Var3.h;
        if (yc4Var == null || (instantZ = yc4Var.c) == null) {
            instantZ = z(tarotReadingHistory.getCreatedTime());
            if (instantZ == null) {
                instantZ = Instant.now();
            }
        } else {
            if (yc4Var.h.h == null) {
                instantZ = null;
            }
            if (instantZ == null) {
                instantZ = z(tarotReadingHistory.getCreatedTime());
                if (instantZ == null) {
                    instantZ = Instant.now();
                }
            }
        }
        Instant instant2 = instantZ;
        Instant instantZ3 = z(tarotReadingHistory.getUpdatedTime());
        Instant instant3 = instantZ3 == null ? instant2 : instantZ3;
        if (cm4Var == null || (instantZ2 = cm4Var.e) == null) {
            TarotReadingBody reading5 = tarotReadingHistory.getReading();
            instantZ2 = z(reading5 != null ? reading5.getCreatedTime() : null);
        }
        Instant instant4 = instantZ2;
        String strJ3 = k99.J(tarotReadingHistory.getChatId());
        TarotReadingQuestionHistory question5 = tarotReadingHistory.getQuestion();
        if (question5 == null || (content = question5.getUserQuestion()) == null) {
            question = tarotReadingHistory.getQuestion();
            if (question != null || (content = question.getConfirmedQuestion()) == null) {
                chat = tarotReadingHistory.getChat();
                if (chat == null && (messages = chat.getMessages()) != null) {
                    Iterator it3 = messages.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it3.next();
                        ChatTextMessage chatTextMessage = (ChatTextMessage) next;
                        if (pa7.t(chatTextMessage.getRole(), "user") && !v4e.Q(chatTextMessage.getContent())) {
                            break;
                        }
                    }
                    ChatTextMessage chatTextMessage2 = (ChatTextMessage) next;
                    if (chatTextMessage2 == null || (content = chatTextMessage2.getContent()) == null) {
                        if (yc4Var != null) {
                            content = "Untitled";
                        } else {
                            content = "Untitled";
                        }
                    }
                } else if (yc4Var != null || (content = yc4Var.f) == null) {
                    content = "Untitled";
                } else {
                    if (v4e.Q(content)) {
                        content = null;
                    }
                    if (content == null) {
                        content = "Untitled";
                    }
                }
            } else {
                if (v4e.Q(content)) {
                    content = null;
                }
                if (content == null) {
                    chat = tarotReadingHistory.getChat();
                    if (chat == null) {
                        if (yc4Var != null) {
                            content = "Untitled";
                        } else {
                            content = "Untitled";
                        }
                    } else if (yc4Var != null) {
                        content = "Untitled";
                    } else {
                        content = "Untitled";
                    }
                }
            }
        } else {
            if (v4e.Q(content)) {
                content = null;
            }
            if (content == null) {
                question = tarotReadingHistory.getQuestion();
                if (question != null) {
                    chat = tarotReadingHistory.getChat();
                    if (chat == null) {
                        if (yc4Var != null) {
                            content = "Untitled";
                        } else {
                            content = "Untitled";
                        }
                    } else if (yc4Var != null) {
                        content = "Untitled";
                    } else {
                        content = "Untitled";
                    }
                } else {
                    chat = tarotReadingHistory.getChat();
                    if (chat == null) {
                        if (yc4Var != null) {
                            content = "Untitled";
                        } else {
                            content = "Untitled";
                        }
                    } else if (yc4Var != null) {
                        content = "Untitled";
                    } else {
                        content = "Untitled";
                    }
                }
            }
        }
        String str14 = content;
        TarotReadingMetadata metadata8 = tarotReadingHistory.getMetadata();
        String divinationType4 = metadata8 != null ? metadata8.getDivinationType() : null;
        if (!pa7.t(divinationType4, "camera")) {
            if (pa7.t(divinationType4, "main")) {
                str = null;
            }
            if (yc4Var != null) {
                fb4Var = yc4Var.h;
            } else {
                fb4Var = null;
            }
            metadata = tarotReadingHistory.getMetadata();
            if (metadata == null && (mixedDeckSnapshot2 = metadata.getMixedDeckSnapshot()) != null) {
                mixedDeckSnapshotW = eb3.W(mixedDeckSnapshot2, strJ3, fb4Var != null ? fb4Var.i : null);
                if (mixedDeckSnapshotW != null) {
                    mixedDeckSnapshot = mixedDeckSnapshotW;
                } else if (fb4Var != null) {
                    mixedDeckSnapshotW = fb4Var.i;
                    mixedDeckSnapshot = mixedDeckSnapshotW;
                } else {
                    mixedDeckSnapshot = null;
                }
            } else if (fb4Var != null) {
                mixedDeckSnapshotW = fb4Var.i;
                mixedDeckSnapshot = mixedDeckSnapshotW;
            } else {
                mixedDeckSnapshot = null;
            }
            if (fb4Var != null) {
                jd4Var = fb4Var.a;
            } else {
                jd4Var = null;
            }
            question2 = tarotReadingHistory.getQuestion();
            spread = tarotReadingHistory.getSpread();
            reading = tarotReadingHistory.getReading();
            strJ = k99.J(tarotReadingHistory.getChatId());
            additionalInfo = tarotReadingHistory.getAdditionalInfo();
            if (additionalInfo != null) {
                additionalQuestionTextInfo = additionalInfo.getAdditionalQuestionTextInfo();
            } else {
                additionalQuestionTextInfo = null;
            }
            additionalInfo2 = tarotReadingHistory.getAdditionalInfo();
            if (additionalInfo2 != null) {
                additionalReadingTextInfo = additionalInfo2.getAdditionalReadingTextInfo();
            } else {
                additionalReadingTextInfo = null;
            }
            ad4VarM = ym8.m(jd4Var);
            if (question2 != null) {
                List<String> userQuestionRecommendations = question2.getUserQuestionRecommendations();
                z3 = true;
                ArrayList arrayList5 = new ArrayList();
                for (Object obj3 : userQuestionRecommendations) {
                    String str15 = strJ3;
                    str13 = (String) obj3;
                    String str16 = strJ;
                    if (v4e.Q(str13) && !str13.equals(question2.getUserQuestion())) {
                        arrayList5.add(obj3);
                    }
                    strJ3 = str15;
                    strJ = str16;
                }
                str2 = strJ3;
                String str17 = strJ;
                String userQuestion2 = question2.getUserQuestion();
                zIsCanTarot = question2.isCanTarot();
                boolean zIsSuitable = question2.isSuitable();
                String suggestions2 = question2.getSuggestions();
                boolIsAdditionalInfoNeeded = question2.isAdditionalInfoNeeded();
                if (boolIsAdditionalInfoNeeded != null) {
                    zBooleanValue = boolIsAdditionalInfoNeeded.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                String additionalInfoQuestion = question2.getAdditionalInfoQuestion();
                needsRevision = question2.getNeedsRevision();
                if (needsRevision != null) {
                    zBooleanValue2 = needsRevision.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
                gd4Var = new gd4(zIsCanTarot, zIsSuitable, arrayList5, userQuestion2, suggestions2, zBooleanValue, additionalInfoQuestion, zBooleanValue2);
                metadata4 = tarotReadingHistory.getMetadata();
                if (metadata4 != null) {
                    scenarioId2 = metadata4.getScenarioId();
                } else {
                    scenarioId2 = null;
                }
                if (scenarioId2 != null) {
                    z11 = true;
                } else {
                    metadata7 = tarotReadingHistory.getMetadata();
                    if (metadata7 != null) {
                        divinationType3 = metadata7.getDivinationType();
                    } else {
                        divinationType3 = null;
                    }
                    if (pa7.t(divinationType3, "camera")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                }
                ed4VarB = ok8.B(gd4Var, additionalQuestionTextInfo, z11);
                if (cm4Var == null) {
                    str3 = null;
                    if (spread != null) {
                        metadata5 = tarotReadingHistory.getMetadata();
                        if (metadata5 != null) {
                            divinationType2 = metadata5.getDivinationType();
                        } else {
                            divinationType2 = null;
                        }
                        if (pa7.t(divinationType2, "camera")) {
                            reading4 = tarotReadingHistory.getReading();
                            if (reading4 != null) {
                                content4 = reading4.getContent();
                            } else {
                                content4 = null;
                            }
                            if (content4 != null || v4e.Q(content4)) {
                                z2 = false;
                                zc4Var = null;
                            } else {
                                listW = w(spread);
                                if (!listW.isEmpty() && spread.getUserSelectedSpread() == null && spread.getSpreadId() == null) {
                                    AiRecommendResponse aiRecommendedSpreads2 = spread.getAiRecommendedSpreads();
                                    if (aiRecommendedSpreads2 != null) {
                                        List<SpreadRecommendationResult> spreads2 = aiRecommendedSpreads2.getSpreads();
                                        if (spreads2.isEmpty()) {
                                            spreads2 = null;
                                        }
                                        if (spreads2 != null) {
                                            z2 = false;
                                            SpreadRecommendationResult spreadRecommendationResult = spreads2.get(mh3.o(aiRecommendedSpreads2.getSuggestedSpreadIndex(), 0, spreads2.size() - 1));
                                            zc4Var2 = new zc4(question2.getUserQuestion(), s72.D0(spreadRecommendationResult.getPatternData(), "-", null, null, new cz1(7), 30), spreadRecommendationResult.getPatternData(), ed4VarB, null, null, spreadRecommendationResult.getSpreadId(), 48);
                                        }
                                    }
                                    zc4Var = null;
                                    z2 = false;
                                } else {
                                    z2 = false;
                                    String userQuestion3 = question2.getUserQuestion();
                                    String strD0 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                    userSelectedSpread = spread.getUserSelectedSpread();
                                    if (userSelectedSpread != null || (spreadId2 = userSelectedSpread.getId()) == null) {
                                        spreadId2 = spread.getSpreadId();
                                    }
                                    zc4Var2 = new zc4(userQuestion3, strD0, listW, ed4VarB, null, null, spreadId2, 48);
                                }
                                zc4Var = zc4Var2;
                            }
                        } else {
                            metadata6 = tarotReadingHistory.getMetadata();
                            if (metadata6 != null) {
                                scenarioId3 = metadata6.getScenarioId();
                            } else {
                                scenarioId3 = null;
                            }
                            if (scenarioId3 != null) {
                                reading4 = tarotReadingHistory.getReading();
                                if (reading4 != null) {
                                    content4 = reading4.getContent();
                                } else {
                                    content4 = null;
                                }
                                if (content4 != null) {
                                }
                                z2 = false;
                                zc4Var = null;
                            } else {
                                listW = w(spread);
                                if (!listW.isEmpty()) {
                                    z2 = false;
                                    String userQuestion4 = question2.getUserQuestion();
                                    String strD1 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                    userSelectedSpread = spread.getUserSelectedSpread();
                                    if (userSelectedSpread != null) {
                                        spreadId2 = spread.getSpreadId();
                                    } else {
                                        spreadId2 = spread.getSpreadId();
                                    }
                                    zc4Var2 = new zc4(userQuestion4, strD1, listW, ed4VarB, null, null, spreadId2, 48);
                                    zc4Var = zc4Var2;
                                } else {
                                    z2 = false;
                                    String userQuestion5 = question2.getUserQuestion();
                                    String strD2 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                    userSelectedSpread = spread.getUserSelectedSpread();
                                    if (userSelectedSpread != null) {
                                        spreadId2 = spread.getSpreadId();
                                    } else {
                                        spreadId2 = spread.getSpreadId();
                                    }
                                    zc4Var2 = new zc4(userQuestion5, strD2, listW, ed4VarB, null, null, spreadId2, 48);
                                    zc4Var = zc4Var2;
                                }
                            }
                        }
                        if (zc4Var != null) {
                            listU2 = u(spread, reading);
                            if (listU2.isEmpty()) {
                                ad4Var = zc4Var;
                            } else {
                                additionalInfo3 = tarotReadingHistory.getAdditionalInfo();
                                if (additionalInfo3 != null) {
                                    additionalReadingAudioInfo = additionalInfo3.getAdditionalReadingAudioInfo();
                                } else {
                                    additionalReadingAudioInfo = null;
                                }
                                if (additionalReadingAudioInfo != null || (transcription = additionalReadingAudioInfo.getTranscription()) == null) {
                                    if (additionalReadingTextInfo != null) {
                                        if (v4e.Q(additionalReadingTextInfo)) {
                                            additionalReadingTextInfo = null;
                                        }
                                        transcription = additionalReadingTextInfo;
                                    } else {
                                        transcription = null;
                                    }
                                    if (transcription != null) {
                                        str10 = transcription;
                                    } else if (ad4VarM != null) {
                                        transcription = ad4VarM.c;
                                        str10 = transcription;
                                    } else {
                                        str10 = null;
                                    }
                                } else {
                                    if (v4e.Q(transcription)) {
                                        transcription = null;
                                    }
                                    if (transcription == null) {
                                        if (additionalReadingTextInfo != null) {
                                            if (v4e.Q(additionalReadingTextInfo)) {
                                                additionalReadingTextInfo = null;
                                            }
                                            transcription = additionalReadingTextInfo;
                                        } else {
                                            transcription = null;
                                        }
                                        if (transcription != null) {
                                            str10 = transcription;
                                        } else if (ad4VarM != null) {
                                            transcription = ad4VarM.c;
                                            str10 = transcription;
                                        } else {
                                            str10 = null;
                                        }
                                    } else {
                                        str10 = transcription;
                                    }
                                }
                                if (additionalReadingAudioInfo == null && additionalReadingAudioInfo.getAssetId() != null) {
                                    str11 = str17;
                                } else if (ad4VarM != null) {
                                    str11 = ad4VarM.d;
                                } else {
                                    str11 = null;
                                }
                                if (additionalReadingAudioInfo == null && (assetId = additionalReadingAudioInfo.getAssetId()) != null) {
                                    str12 = assetId;
                                } else if (ad4VarM != null) {
                                    String assetId = ad4VarM.e;
                                    str12 = assetId;
                                } else {
                                    str12 = null;
                                }
                                ad4Var = new ad4(zc4Var, listU2, str10, str11, str12);
                                if (reading != null) {
                                    content5 = reading.getContent();
                                } else {
                                    content5 = null;
                                }
                                if (content5 != null && !v4e.Q(content5)) {
                                    ad4Var = new bd4(content5, ad4Var);
                                }
                            }
                        }
                    } else {
                        z2 = false;
                    }
                    ad4Var = ed4VarB;
                } else {
                    if (reading != null) {
                        content6 = reading.getContent();
                    } else {
                        content6 = null;
                    }
                    if (content6 != null || v4e.Q(content6)) {
                        if (zIsCanTarot || !zIsSuitable || zBooleanValue2) {
                            str3 = null;
                            ad4Var = gd4Var;
                        } else if (!pa7.t(jd4Var != null ? ym8.J(jd4Var) : null, question2.getUserQuestion())) {
                            str3 = null;
                            z2 = false;
                            ad4Var = ed4VarB;
                        } else if (jd4Var instanceof ad4) {
                            str3 = null;
                            ad4Var = jd4Var;
                        } else if (jd4Var instanceof fd4) {
                            str3 = null;
                            ad4Var = fd4.b((fd4) jd4Var, gd4Var, null, 2);
                        } else {
                            str3 = null;
                            ad4Var = ed4VarB;
                        }
                        z2 = false;
                    } else {
                        str3 = null;
                        if (spread != null) {
                            metadata5 = tarotReadingHistory.getMetadata();
                            if (metadata5 != null) {
                                divinationType2 = metadata5.getDivinationType();
                            } else {
                                divinationType2 = null;
                            }
                            if (pa7.t(divinationType2, "camera")) {
                                reading4 = tarotReadingHistory.getReading();
                                if (reading4 != null) {
                                    content4 = reading4.getContent();
                                } else {
                                    content4 = null;
                                }
                                if (content4 != null) {
                                }
                                z2 = false;
                                zc4Var = null;
                            } else {
                                metadata6 = tarotReadingHistory.getMetadata();
                                if (metadata6 != null) {
                                    scenarioId3 = metadata6.getScenarioId();
                                } else {
                                    scenarioId3 = null;
                                }
                                if (scenarioId3 != null) {
                                    reading4 = tarotReadingHistory.getReading();
                                    if (reading4 != null) {
                                        content4 = reading4.getContent();
                                    } else {
                                        content4 = null;
                                    }
                                    if (content4 != null) {
                                    }
                                    z2 = false;
                                    zc4Var = null;
                                } else {
                                    listW = w(spread);
                                    if (!listW.isEmpty()) {
                                        z2 = false;
                                        String userQuestion6 = question2.getUserQuestion();
                                        String strD3 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                        userSelectedSpread = spread.getUserSelectedSpread();
                                        if (userSelectedSpread != null) {
                                            spreadId2 = spread.getSpreadId();
                                        } else {
                                            spreadId2 = spread.getSpreadId();
                                        }
                                        zc4Var2 = new zc4(userQuestion6, strD3, listW, ed4VarB, null, null, spreadId2, 48);
                                        zc4Var = zc4Var2;
                                    } else {
                                        z2 = false;
                                        String userQuestion7 = question2.getUserQuestion();
                                        String strD4 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                        userSelectedSpread = spread.getUserSelectedSpread();
                                        if (userSelectedSpread != null) {
                                            spreadId2 = spread.getSpreadId();
                                        } else {
                                            spreadId2 = spread.getSpreadId();
                                        }
                                        zc4Var2 = new zc4(userQuestion7, strD4, listW, ed4VarB, null, null, spreadId2, 48);
                                        zc4Var = zc4Var2;
                                    }
                                }
                            }
                            if (zc4Var != null) {
                                listU2 = u(spread, reading);
                                if (listU2.isEmpty()) {
                                    ad4Var = zc4Var;
                                } else {
                                    additionalInfo3 = tarotReadingHistory.getAdditionalInfo();
                                    if (additionalInfo3 != null) {
                                        additionalReadingAudioInfo = additionalInfo3.getAdditionalReadingAudioInfo();
                                    } else {
                                        additionalReadingAudioInfo = null;
                                    }
                                    if (additionalReadingAudioInfo != null) {
                                        if (additionalReadingTextInfo != null) {
                                            if (v4e.Q(additionalReadingTextInfo)) {
                                                additionalReadingTextInfo = null;
                                            }
                                            transcription = additionalReadingTextInfo;
                                        } else {
                                            transcription = null;
                                        }
                                        if (transcription != null) {
                                            str10 = transcription;
                                        } else if (ad4VarM != null) {
                                            transcription = ad4VarM.c;
                                            str10 = transcription;
                                        } else {
                                            str10 = null;
                                        }
                                    } else {
                                        if (additionalReadingTextInfo != null) {
                                            if (v4e.Q(additionalReadingTextInfo)) {
                                                additionalReadingTextInfo = null;
                                            }
                                            transcription = additionalReadingTextInfo;
                                        } else {
                                            transcription = null;
                                        }
                                        if (transcription != null) {
                                            str10 = transcription;
                                        } else if (ad4VarM != null) {
                                            transcription = ad4VarM.c;
                                            str10 = transcription;
                                        } else {
                                            str10 = null;
                                        }
                                    }
                                    if (additionalReadingAudioInfo == null) {
                                        if (ad4VarM != null) {
                                            str11 = ad4VarM.d;
                                        } else {
                                            str11 = null;
                                        }
                                    } else if (ad4VarM != null) {
                                        str11 = ad4VarM.d;
                                    } else {
                                        str11 = null;
                                    }
                                    if (additionalReadingAudioInfo == null) {
                                        if (ad4VarM != null) {
                                            String assetId2 = ad4VarM.e;
                                            str12 = assetId2;
                                        } else {
                                            str12 = null;
                                        }
                                    } else if (ad4VarM != null) {
                                        String assetId3 = ad4VarM.e;
                                        str12 = assetId3;
                                    } else {
                                        str12 = null;
                                    }
                                    ad4Var = new ad4(zc4Var, listU2, str10, str11, str12);
                                    if (reading != null) {
                                        content5 = reading.getContent();
                                    } else {
                                        content5 = null;
                                    }
                                    if (content5 != null) {
                                        ad4Var = new bd4(content5, ad4Var);
                                    }
                                }
                            }
                        } else {
                            z2 = false;
                        }
                        ad4Var = ed4VarB;
                    }
                }
            } else {
                str2 = strJ3;
                str3 = null;
                z2 = false;
                z3 = true;
                ad4Var = hd4.a;
            }
            if (fb4Var != null || (jd4Var2 = fb4Var.a) == null) {
                r1 = str3;
            } else if (jd4Var2 instanceof bd4) {
                bd4 bd4Var = (bd4) jd4Var2;
                if (v4e.Q(bd4Var.a)) {
                    r1 = jd4Var2;
                    r1 = jd4Var2;
                    r1 = bd4Var.b;
                }
            }
            r1 = jd4Var2;
            r1 = jd4Var2;
            r1 = jd4Var2;
            question3 = tarotReadingHistory.getQuestion();
            if (cm4Var == null) {
                z4 = z2;
            } else {
                reading3 = tarotReadingHistory.getReading();
                if (reading3 != null) {
                    content3 = reading3.getContent();
                } else {
                    content3 = str3;
                }
                if (content3 != null || v4e.Q(content3)) {
                    if ((question3 != null || question3.isCanTarot()) && (question3 == null || question3.isSuitable())) {
                        if (question3 != null) {
                            zT = pa7.t(question3.getNeedsRevision(), Boolean.TRUE);
                        } else {
                            zT = z2;
                        }
                        if (!zT) {
                            if (r1 != 0 && (strJ2 = ym8.J(r1)) != null) {
                                if (question3 != null) {
                                    userQuestion = question3.getUserQuestion();
                                } else {
                                    userQuestion = str3;
                                }
                                if ((!strJ2.equals(userQuestion)) == z3) {
                                }
                            }
                            z4 = z2;
                        }
                    }
                    z4 = true;
                } else {
                    z4 = z2;
                }
            }
            if (r1 != 0 || z4 || y(r1) <= y(ad4Var)) {
                z5 = z2;
            } else {
                z5 = true;
            }
            if (fb4Var != null || (fb4Var.e == null && fb4Var.c == null)) {
                z6 = z2;
            } else {
                z6 = true;
            }
            if (z5) {
                ad4Var = r1;
            }
            if (fb4Var != null) {
                list = fb4Var.b;
            } else {
                list = str3;
            }
            pu4Var = pu4.a;
            if (list == null) {
                list = pu4Var;
            }
            str4 = str3;
            arrayList = new ArrayList();
            question4 = tarotReadingHistory.getQuestion();
            if (question4 != null) {
                suggestions = question4.getSuggestions();
            } else {
                suggestions = str4;
            }
            if (suggestions != null && suggestions.length() != 0) {
                arrayList.add(new kt8(ib8.i(), suggestions));
            }
            reading2 = tarotReadingHistory.getReading();
            if (reading2 != null) {
                content2 = reading2.getContent();
            } else {
                content2 = str4;
            }
            if (content2 != null && !v4e.Q(content2)) {
                arrayList.add(new et8(ib8.i(), content2, true));
            }
            arrayList2 = new ArrayList();
            for (Object obj4 : list) {
                if (obj4 instanceof jt8) {
                    arrayList2.add(obj4);
                }
            }
            iF = bm8.F(t72.u(arrayList2, 10));
            if (iF < 16) {
                iF = 16;
            }
            linkedHashMap = new LinkedHashMap(iF);
            for (Object obj5 : arrayList2) {
                linkedHashMap.put(((jt8) obj5).a, obj5);
            }
            m8b m8bVar = cp5.a;
            chat2 = tarotReadingHistory.getChat();
            if (chat2 != null) {
                messages2 = chat2.getMessages();
            } else {
                messages2 = str4;
            }
            if (messages2 == null) {
                messages2 = pu4Var;
            }
            ArrayList arrayListC = cp5.c(messages2);
            arrayList3 = new ArrayList(t72.u(arrayListC, 10));
            it = arrayListC.iterator();
            while (it.hasNext()) {
                jt8Var = (ot8) it.next();
                if (jt8Var instanceof jt8) {
                    jt8Var2 = (jt8) jt8Var;
                    it2 = it;
                    str7 = jt8Var2.c;
                    z9 = z6;
                    str8 = jt8Var2.a;
                    z10 = z5;
                    if (jt8Var2.d == null && (jt8Var3 = (jt8) linkedHashMap.get(str8)) != null) {
                        if (str7 == null && (t68Var = jt8Var3.d) != null) {
                            str9 = jt8Var3.c;
                            if (str9 == null) {
                                str9 = t68Var.a;
                            }
                            pu4Var3 = pu4Var;
                            if (k99.J(str7).equals(k99.J(str9))) {
                                String str18 = t68Var.b;
                                String str19 = t68Var.c;
                                str18.getClass();
                                t68 t68Var2 = new t68(str7, str18, str19);
                                str8.getClass();
                                jt8Var = new jt8(str8, str18, str7, t68Var2);
                            }
                        } else {
                            pu4Var3 = pu4Var;
                        }
                        jt8Var = jt8Var2;
                    }
                    arrayList3.add(jt8Var);
                    it = it2;
                    z6 = z9;
                    z5 = z10;
                    pu4Var = pu4Var3;
                } else {
                    it2 = it;
                    z9 = z6;
                    z10 = z5;
                }
                pu4Var3 = pu4Var;
                arrayList3.add(jt8Var);
                it = it2;
                z6 = z9;
                z5 = z10;
                pu4Var = pu4Var3;
            }
            boolean z12 = z6;
            z7 = z5;
            pu4Var2 = pu4Var;
            arrayList.addAll(arrayList3);
            Set set = qp5.a;
            pp5VarA = qp5.a(qu4.a, arrayList);
            if (fb4Var == null) {
                r2 = usageBlocked;
                reason = str4;
            } else {
                reason = fb4Var.g;
                if (reason == null) {
                    failReason = fb4Var.d;
                    if (failReason instanceof FailReason.UsageBlocked) {
                        usageBlocked = (FailReason.UsageBlocked) failReason;
                    } else {
                        r2 = str4;
                    }
                    if (r2 != 0) {
                        r2 = usageBlocked;
                        reason = r2.getReason();
                    } else {
                        r2 = usageBlocked;
                        reason = str4;
                    }
                }
            }
            if (ad4Var instanceof ad4) {
                r10 = reason;
            } else {
                r10 = str4;
            }
            chat3 = tarotReadingHistory.getChat();
            if (chat3 != null) {
                messages3 = chat3.getMessages();
            } else {
                messages3 = str4;
            }
            if (messages3 == null) {
                if (fb4Var != null) {
                    obj2 = fb4Var.f;
                } else {
                    obj2 = str4;
                }
                if (obj2 == null) {
                    r9 = pu4Var2;
                } else {
                    r9 = obj2;
                }
            } else {
                if (fb4Var != null) {
                    list2 = fb4Var.f;
                } else {
                    list2 = str4;
                }
                if (list2 == null) {
                    list3 = pu4Var2;
                } else {
                    list3 = list2;
                }
                arrayList4 = new ArrayList();
                for (Object obj6 : list3) {
                    t12Var = (t12) pp5VarA.b.get(((PendingClarifyingCardSubmission) obj6).getRequestMessageId());
                    if (t12Var != null) {
                        obj = t12Var.d;
                    } else {
                        obj = str4;
                    }
                    if (obj == ClarifyingCardState.PendingDecision) {
                        arrayList4.add(obj6);
                    }
                }
                r9 = arrayList4;
            }
            if (z7 || !z12) {
                z8 = false;
                fb4Var2 = new fb4((jd4) ad4Var, arrayList, (Operation) null, (FailReason) null, (Operation) null, (List) r9, (QuotaBlockReason) r10, cm4Var, mixedDeckSnapshot);
            } else {
                z8 = false;
                fb4Var2 = fb4.a(fb4Var, null, null, null, null, null, r9, null, cm4Var, mixedDeckSnapshot, 95);
            }
            if (yc4Var != null) {
                r5 = yc4Var.j;
            } else {
                r5 = str4;
            }
            metadata2 = tarotReadingHistory.getMetadata();
            if (metadata2 != null || (scenarioId = metadata2.getScenarioId()) == null || (spread4 = tarotReadingHistory.getSpread()) == null) {
                sceneTarot = str4;
            } else {
                UserSelectedSpread userSelectedSpread2 = spread4.getUserSelectedSpread();
                if (userSelectedSpread2 == null || (spreadId = userSelectedSpread2.getId()) == null) {
                    spreadId = spread4.getSpreadId();
                }
                String str20 = spreadId;
                List listW2 = w(spread4);
                List listU3 = u(spread4, tarotReadingHistory.getReading());
                if (listU3.isEmpty() || listW2.isEmpty()) {
                    sceneTarot = str4;
                } else {
                    if (scenarioId.equals(str20)) {
                        scenarioId = str4;
                    }
                    sceneTarot = new SceneTarot(s72.D0(listW2, "-", null, null, new cz1(8), 30), listW2, listU3, str20, scenarioId == null ? r5 != 0 ? r5.getSceneId() : str4 : scenarioId);
                }
            }
            metadata3 = tarotReadingHistory.getMetadata();
            if (metadata3 != null) {
                divinationType = metadata3.getDivinationType();
            } else {
                divinationType = str4;
            }
            if (pa7.t(divinationType, "camera") || (spread2 = tarotReadingHistory.getSpread()) == null) {
                physicalDeckReading = str4;
            } else {
                listU = u(spread2, tarotReadingHistory.getReading());
                List listW3 = w(spread2);
                if (!listU.isEmpty() || listW3.isEmpty()) {
                    physicalDeckReading = str4;
                } else {
                    physicalDeckReading = new PhysicalDeckReading(listU, listW3);
                }
            }
            instant2.getClass();
            instant3.getClass();
            int size = fb4Var2.b.size();
            if (yc4Var != null) {
                z8 = yc4Var.i;
            }
            if (sceneTarot != null) {
                r22 = sceneTarot;
            } else if (yc4Var != null) {
                sceneTarot = yc4Var.j;
                r22 = sceneTarot;
            } else {
                r22 = str4;
            }
            if (yc4Var != null) {
                r23 = yc4Var.k;
            } else {
                r23 = str4;
            }
            if (str == null) {
                str5 = str;
            } else if (yc4Var != null) {
                str5 = yc4Var.l;
            } else {
                str5 = str4;
            }
            if (yc4Var != null) {
                str6 = yc4Var.m;
            } else {
                str6 = str4;
            }
            spread3 = tarotReadingHistory.getSpread();
            if (spread3 == null && (aiRecommendedSpreads = spread3.getAiRecommendedSpreads()) != null && (spreads = aiRecommendedSpreads.getSpreads()) != null) {
                if (spreads.isEmpty()) {
                    spreads = str4;
                }
                if (spreads != null) {
                    list4 = spreads;
                } else if (yc4Var != null) {
                    spreads = yc4Var.n;
                    list4 = spreads;
                } else {
                    list4 = str4;
                }
            } else if (yc4Var != null) {
                spreads = yc4Var.n;
                list4 = spreads;
            } else {
                list4 = str4;
            }
            if (yc4Var != null) {
                r27 = yc4Var.o;
            } else {
                r27 = str4;
            }
            if (yc4Var != null) {
                r29 = yc4Var.q;
            } else {
                r29 = str4;
            }
            if (physicalDeckReading == null) {
                r31 = physicalDeckReading;
            } else if (yc4Var != null) {
                r31 = yc4Var.s;
            } else {
                r31 = str4;
            }
            return new yc4(str2, false, instant2, instant3, instant4, str14, size, fb4Var2, z8, r22, r23, str5, str6, list4, r27, instant, r29, null, r31, 3801088);
        }
        divinationType4 = "physical_deck";
        str = divinationType4;
        if (yc4Var != null) {
            fb4Var = yc4Var.h;
        } else {
            fb4Var = null;
        }
        metadata = tarotReadingHistory.getMetadata();
        if (metadata == null) {
            if (fb4Var != null) {
                mixedDeckSnapshotW = fb4Var.i;
                mixedDeckSnapshot = mixedDeckSnapshotW;
            } else {
                mixedDeckSnapshot = null;
            }
        } else if (fb4Var != null) {
            mixedDeckSnapshotW = fb4Var.i;
            mixedDeckSnapshot = mixedDeckSnapshotW;
        } else {
            mixedDeckSnapshot = null;
        }
        if (fb4Var != null) {
            jd4Var = fb4Var.a;
        } else {
            jd4Var = null;
        }
        question2 = tarotReadingHistory.getQuestion();
        spread = tarotReadingHistory.getSpread();
        reading = tarotReadingHistory.getReading();
        strJ = k99.J(tarotReadingHistory.getChatId());
        additionalInfo = tarotReadingHistory.getAdditionalInfo();
        if (additionalInfo != null) {
            additionalQuestionTextInfo = additionalInfo.getAdditionalQuestionTextInfo();
        } else {
            additionalQuestionTextInfo = null;
        }
        additionalInfo2 = tarotReadingHistory.getAdditionalInfo();
        if (additionalInfo2 != null) {
            additionalReadingTextInfo = additionalInfo2.getAdditionalReadingTextInfo();
        } else {
            additionalReadingTextInfo = null;
        }
        ad4VarM = ym8.m(jd4Var);
        if (question2 != null) {
            List<String> userQuestionRecommendations2 = question2.getUserQuestionRecommendations();
            z3 = true;
            ArrayList arrayList6 = new ArrayList();
            while (r22.hasNext()) {
                String str110 = strJ3;
                str13 = (String) obj3;
                String str111 = strJ;
                if (v4e.Q(str13)) {
                }
                strJ3 = str110;
                strJ = str111;
            }
            str2 = strJ3;
            String str112 = strJ;
            String userQuestion8 = question2.getUserQuestion();
            zIsCanTarot = question2.isCanTarot();
            boolean zIsSuitable2 = question2.isSuitable();
            String suggestions3 = question2.getSuggestions();
            boolIsAdditionalInfoNeeded = question2.isAdditionalInfoNeeded();
            if (boolIsAdditionalInfoNeeded != null) {
                zBooleanValue = boolIsAdditionalInfoNeeded.booleanValue();
            } else {
                zBooleanValue = false;
            }
            String additionalInfoQuestion2 = question2.getAdditionalInfoQuestion();
            needsRevision = question2.getNeedsRevision();
            if (needsRevision != null) {
                zBooleanValue2 = needsRevision.booleanValue();
            } else {
                zBooleanValue2 = false;
            }
            gd4Var = new gd4(zIsCanTarot, zIsSuitable2, arrayList6, userQuestion8, suggestions3, zBooleanValue, additionalInfoQuestion2, zBooleanValue2);
            metadata4 = tarotReadingHistory.getMetadata();
            if (metadata4 != null) {
                scenarioId2 = metadata4.getScenarioId();
            } else {
                scenarioId2 = null;
            }
            if (scenarioId2 != null) {
                z11 = true;
            } else {
                metadata7 = tarotReadingHistory.getMetadata();
                if (metadata7 != null) {
                    divinationType3 = metadata7.getDivinationType();
                } else {
                    divinationType3 = null;
                }
                if (pa7.t(divinationType3, "camera")) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            ed4VarB = ok8.B(gd4Var, additionalQuestionTextInfo, z11);
            if (cm4Var == null) {
                str3 = null;
                if (spread != null) {
                    metadata5 = tarotReadingHistory.getMetadata();
                    if (metadata5 != null) {
                        divinationType2 = metadata5.getDivinationType();
                    } else {
                        divinationType2 = null;
                    }
                    if (pa7.t(divinationType2, "camera")) {
                        reading4 = tarotReadingHistory.getReading();
                        if (reading4 != null) {
                            content4 = reading4.getContent();
                        } else {
                            content4 = null;
                        }
                        if (content4 != null) {
                        }
                        z2 = false;
                        zc4Var = null;
                    } else {
                        metadata6 = tarotReadingHistory.getMetadata();
                        if (metadata6 != null) {
                            scenarioId3 = metadata6.getScenarioId();
                        } else {
                            scenarioId3 = null;
                        }
                        if (scenarioId3 != null) {
                            reading4 = tarotReadingHistory.getReading();
                            if (reading4 != null) {
                                content4 = reading4.getContent();
                            } else {
                                content4 = null;
                            }
                            if (content4 != null) {
                            }
                            z2 = false;
                            zc4Var = null;
                        } else {
                            listW = w(spread);
                            if (!listW.isEmpty()) {
                                z2 = false;
                                String userQuestion9 = question2.getUserQuestion();
                                String strD5 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                userSelectedSpread = spread.getUserSelectedSpread();
                                if (userSelectedSpread != null) {
                                    spreadId2 = spread.getSpreadId();
                                } else {
                                    spreadId2 = spread.getSpreadId();
                                }
                                zc4Var2 = new zc4(userQuestion9, strD5, listW, ed4VarB, null, null, spreadId2, 48);
                                zc4Var = zc4Var2;
                            } else {
                                z2 = false;
                                String userQuestion10 = question2.getUserQuestion();
                                String strD6 = s72.D0(listW, "-", null, null, new cz1(6), 30);
                                userSelectedSpread = spread.getUserSelectedSpread();
                                if (userSelectedSpread != null) {
                                    spreadId2 = spread.getSpreadId();
                                } else {
                                    spreadId2 = spread.getSpreadId();
                                }
                                zc4Var2 = new zc4(userQuestion10, strD6, listW, ed4VarB, null, null, spreadId2, 48);
                                zc4Var = zc4Var2;
                            }
                        }
                    }
                    if (zc4Var != null) {
                        listU2 = u(spread, reading);
                        if (listU2.isEmpty()) {
                            ad4Var = zc4Var;
                        } else {
                            additionalInfo3 = tarotReadingHistory.getAdditionalInfo();
                            if (additionalInfo3 != null) {
                                additionalReadingAudioInfo = additionalInfo3.getAdditionalReadingAudioInfo();
                            } else {
                                additionalReadingAudioInfo = null;
                            }
                            if (additionalReadingAudioInfo != null) {
                                if (additionalReadingTextInfo != null) {
                                    if (v4e.Q(additionalReadingTextInfo)) {
                                        additionalReadingTextInfo = null;
                                    }
                                    transcription = additionalReadingTextInfo;
                                } else {
                                    transcription = null;
                                }
                                if (transcription != null) {
                                    str10 = transcription;
                                } else if (ad4VarM != null) {
                                    transcription = ad4VarM.c;
                                    str10 = transcription;
                                } else {
                                    str10 = null;
                                }
                            } else {
                                if (additionalReadingTextInfo != null) {
                                    if (v4e.Q(additionalReadingTextInfo)) {
                                        additionalReadingTextInfo = null;
                                    }
                                    transcription = additionalReadingTextInfo;
                                } else {
                                    transcription = null;
                                }
                                if (transcription != null) {
                                    str10 = transcription;
                                } else if (ad4VarM != null) {
                                    transcription = ad4VarM.c;
                                    str10 = transcription;
                                } else {
                                    str10 = null;
                                }
                            }
                            if (additionalReadingAudioInfo == null) {
                                if (ad4VarM != null) {
                                    str11 = ad4VarM.d;
                                } else {
                                    str11 = null;
                                }
                            } else if (ad4VarM != null) {
                                str11 = ad4VarM.d;
                            } else {
                                str11 = null;
                            }
                            if (additionalReadingAudioInfo == null) {
                                if (ad4VarM != null) {
                                    String assetId4 = ad4VarM.e;
                                    str12 = assetId4;
                                } else {
                                    str12 = null;
                                }
                            } else if (ad4VarM != null) {
                                String assetId5 = ad4VarM.e;
                                str12 = assetId5;
                            } else {
                                str12 = null;
                            }
                            ad4Var = new ad4(zc4Var, listU2, str10, str11, str12);
                            if (reading != null) {
                                content5 = reading.getContent();
                            } else {
                                content5 = null;
                            }
                            if (content5 != null) {
                                ad4Var = new bd4(content5, ad4Var);
                            }
                        }
                    }
                } else {
                    z2 = false;
                }
                ad4Var = ed4VarB;
            } else {
                if (reading != null) {
                    content6 = reading.getContent();
                } else {
                    content6 = null;
                }
                if (content6 != null) {
                }
                if (zIsCanTarot) {
                    str3 = null;
                    ad4Var = gd4Var;
                } else {
                    str3 = null;
                    ad4Var = gd4Var;
                }
                z2 = false;
            }
        } else {
            str2 = strJ3;
            str3 = null;
            z2 = false;
            z3 = true;
            ad4Var = hd4.a;
        }
        if (fb4Var != null) {
            r1 = str3;
        } else {
            r1 = str3;
        }
        r1 = jd4Var2;
        r1 = jd4Var2;
        r1 = jd4Var2;
        question3 = tarotReadingHistory.getQuestion();
        if (cm4Var == null) {
            z4 = z2;
        } else {
            reading3 = tarotReadingHistory.getReading();
            if (reading3 != null) {
                content3 = reading3.getContent();
            } else {
                content3 = str3;
            }
            if (content3 != null) {
                if (question3 != null) {
                    if (question3 != null) {
                        zT = pa7.t(question3.getNeedsRevision(), Boolean.TRUE);
                    } else {
                        zT = z2;
                    }
                    if (!zT) {
                        if (r1 != 0) {
                            if (question3 != null) {
                                userQuestion = question3.getUserQuestion();
                            } else {
                                userQuestion = str3;
                            }
                            if ((!strJ2.equals(userQuestion)) == z3) {
                            }
                        }
                        z4 = z2;
                    }
                    z4 = true;
                } else {
                    if (question3 != null) {
                        zT = pa7.t(question3.getNeedsRevision(), Boolean.TRUE);
                    } else {
                        zT = z2;
                    }
                    if (!zT) {
                        if (r1 != 0) {
                            if (question3 != null) {
                                userQuestion = question3.getUserQuestion();
                            } else {
                                userQuestion = str3;
                            }
                            if ((!strJ2.equals(userQuestion)) == z3) {
                            }
                        }
                        z4 = z2;
                    }
                    z4 = true;
                }
            } else if (question3 != null) {
                if (question3 != null) {
                    zT = pa7.t(question3.getNeedsRevision(), Boolean.TRUE);
                } else {
                    zT = z2;
                }
                if (!zT) {
                    if (r1 != 0) {
                        if (question3 != null) {
                            userQuestion = question3.getUserQuestion();
                        } else {
                            userQuestion = str3;
                        }
                        if ((!strJ2.equals(userQuestion)) == z3) {
                        }
                    }
                    z4 = z2;
                }
                z4 = true;
            } else {
                if (question3 != null) {
                    zT = pa7.t(question3.getNeedsRevision(), Boolean.TRUE);
                } else {
                    zT = z2;
                }
                if (!zT) {
                    if (r1 != 0) {
                        if (question3 != null) {
                            userQuestion = question3.getUserQuestion();
                        } else {
                            userQuestion = str3;
                        }
                        if ((!strJ2.equals(userQuestion)) == z3) {
                        }
                    }
                    z4 = z2;
                }
                z4 = true;
            }
        }
        if (r1 != 0) {
            z5 = z2;
        } else {
            z5 = z2;
        }
        if (fb4Var != null) {
            z6 = z2;
        } else {
            z6 = z2;
        }
        if (z5) {
            ad4Var = r1;
        }
        if (fb4Var != null) {
            list = fb4Var.b;
        } else {
            list = str3;
        }
        pu4Var = pu4.a;
        if (list == null) {
            list = pu4Var;
        }
        str4 = str3;
        arrayList = new ArrayList();
        question4 = tarotReadingHistory.getQuestion();
        if (question4 != null) {
            suggestions = question4.getSuggestions();
        } else {
            suggestions = str4;
        }
        if (suggestions != null) {
            arrayList.add(new kt8(ib8.i(), suggestions));
        }
        reading2 = tarotReadingHistory.getReading();
        if (reading2 != null) {
            content2 = reading2.getContent();
        } else {
            content2 = str4;
        }
        if (content2 != null) {
            arrayList.add(new et8(ib8.i(), content2, true));
        }
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            if (obj4 instanceof jt8) {
                arrayList2.add(obj4);
            }
        }
        iF = bm8.F(t72.u(arrayList2, 10));
        if (iF < 16) {
            iF = 16;
        }
        linkedHashMap = new LinkedHashMap(iF);
        while (r8.hasNext()) {
            linkedHashMap.put(((jt8) obj5).a, obj5);
        }
        m8b m8bVar2 = cp5.a;
        chat2 = tarotReadingHistory.getChat();
        if (chat2 != null) {
            messages2 = chat2.getMessages();
        } else {
            messages2 = str4;
        }
        if (messages2 == null) {
            messages2 = pu4Var;
        }
        ArrayList arrayListC2 = cp5.c(messages2);
        arrayList3 = new ArrayList(t72.u(arrayListC2, 10));
        it = arrayListC2.iterator();
        while (it.hasNext()) {
            jt8Var = (ot8) it.next();
            if (jt8Var instanceof jt8) {
                jt8Var2 = (jt8) jt8Var;
                it2 = it;
                str7 = jt8Var2.c;
                z9 = z6;
                str8 = jt8Var2.a;
                z10 = z5;
                if (jt8Var2.d == null) {
                    if (str7 == null) {
                        pu4Var3 = pu4Var;
                        jt8Var = jt8Var2;
                    } else {
                        str9 = jt8Var3.c;
                        if (str9 == null) {
                            str9 = t68Var.a;
                        }
                        pu4Var3 = pu4Var;
                        if (k99.J(str7).equals(k99.J(str9))) {
                            jt8Var = jt8Var2;
                        } else {
                            String str113 = t68Var.b;
                            String str114 = t68Var.c;
                            str113.getClass();
                            t68 t68Var3 = new t68(str7, str113, str114);
                            str8.getClass();
                            jt8Var = new jt8(str8, str113, str7, t68Var3);
                        }
                    }
                }
                arrayList3.add(jt8Var);
                it = it2;
                z6 = z9;
                z5 = z10;
                pu4Var = pu4Var3;
            } else {
                it2 = it;
                z9 = z6;
                z10 = z5;
            }
            pu4Var3 = pu4Var;
            arrayList3.add(jt8Var);
            it = it2;
            z6 = z9;
            z5 = z10;
            pu4Var = pu4Var3;
        }
        boolean z13 = z6;
        z7 = z5;
        pu4Var2 = pu4Var;
        arrayList.addAll(arrayList3);
        Set set2 = qp5.a;
        pp5VarA = qp5.a(qu4.a, arrayList);
        if (fb4Var == null) {
            r2 = usageBlocked;
            reason = str4;
        } else {
            reason = fb4Var.g;
            if (reason == null) {
                failReason = fb4Var.d;
                if (failReason instanceof FailReason.UsageBlocked) {
                    usageBlocked = (FailReason.UsageBlocked) failReason;
                } else {
                    r2 = str4;
                }
                if (r2 != 0) {
                    r2 = usageBlocked;
                    reason = r2.getReason();
                } else {
                    r2 = usageBlocked;
                    reason = str4;
                }
            }
        }
        if (ad4Var instanceof ad4) {
            r10 = reason;
        } else {
            r10 = str4;
        }
        chat3 = tarotReadingHistory.getChat();
        if (chat3 != null) {
            messages3 = chat3.getMessages();
        } else {
            messages3 = str4;
        }
        if (messages3 == null) {
            if (fb4Var != null) {
                obj2 = fb4Var.f;
            } else {
                obj2 = str4;
            }
            if (obj2 == null) {
                r9 = pu4Var2;
            } else {
                r9 = obj2;
            }
        } else {
            if (fb4Var != null) {
                list2 = fb4Var.f;
            } else {
                list2 = str4;
            }
            if (list2 == null) {
                list3 = pu4Var2;
            } else {
                list3 = list2;
            }
            arrayList4 = new ArrayList();
            while (r6.hasNext()) {
                t12Var = (t12) pp5VarA.b.get(((PendingClarifyingCardSubmission) obj6).getRequestMessageId());
                if (t12Var != null) {
                    obj = t12Var.d;
                } else {
                    obj = str4;
                }
                if (obj == ClarifyingCardState.PendingDecision) {
                    arrayList4.add(obj6);
                }
            }
            r9 = arrayList4;
        }
        if (z7) {
            z8 = false;
            fb4Var2 = new fb4((jd4) ad4Var, arrayList, (Operation) null, (FailReason) null, (Operation) null, (List) r9, (QuotaBlockReason) r10, cm4Var, mixedDeckSnapshot);
        } else {
            z8 = false;
            fb4Var2 = new fb4((jd4) ad4Var, arrayList, (Operation) null, (FailReason) null, (Operation) null, (List) r9, (QuotaBlockReason) r10, cm4Var, mixedDeckSnapshot);
        }
        if (yc4Var != null) {
            r5 = yc4Var.j;
        } else {
            r5 = str4;
        }
        metadata2 = tarotReadingHistory.getMetadata();
        if (metadata2 != null) {
            sceneTarot = str4;
        } else {
            sceneTarot = str4;
        }
        metadata3 = tarotReadingHistory.getMetadata();
        if (metadata3 != null) {
            divinationType = metadata3.getDivinationType();
        } else {
            divinationType = str4;
        }
        if (pa7.t(divinationType, "camera")) {
            physicalDeckReading = str4;
        } else {
            listU = u(spread2, tarotReadingHistory.getReading());
            List listW4 = w(spread2);
            if (listU.isEmpty()) {
                physicalDeckReading = str4;
            } else {
                physicalDeckReading = str4;
            }
        }
        instant2.getClass();
        instant3.getClass();
        int size2 = fb4Var2.b.size();
        if (yc4Var != null) {
            z8 = yc4Var.i;
        }
        if (sceneTarot != null) {
            r22 = sceneTarot;
        } else if (yc4Var != null) {
            sceneTarot = yc4Var.j;
            r22 = sceneTarot;
        } else {
            r22 = str4;
        }
        if (yc4Var != null) {
            r23 = yc4Var.k;
        } else {
            r23 = str4;
        }
        if (str == null) {
            str5 = str;
        } else if (yc4Var != null) {
            str5 = yc4Var.l;
        } else {
            str5 = str4;
        }
        if (yc4Var != null) {
            str6 = yc4Var.m;
        } else {
            str6 = str4;
        }
        spread3 = tarotReadingHistory.getSpread();
        if (spread3 == null) {
            if (yc4Var != null) {
                spreads = yc4Var.n;
                list4 = spreads;
            } else {
                list4 = str4;
            }
        } else if (yc4Var != null) {
            spreads = yc4Var.n;
            list4 = spreads;
        } else {
            list4 = str4;
        }
        if (yc4Var != null) {
            r27 = yc4Var.o;
        } else {
            r27 = str4;
        }
        if (yc4Var != null) {
            r29 = yc4Var.q;
        } else {
            r29 = str4;
        }
        if (physicalDeckReading == null) {
            r31 = physicalDeckReading;
        } else if (yc4Var != null) {
            r31 = yc4Var.s;
        } else {
            r31 = str4;
        }
        return new yc4(str2, false, instant2, instant3, instant4, str14, size2, fb4Var2, z8, r22, r23, str5, str6, list4, r27, instant, r29, null, r31, 3801088);
    }

    public static /* synthetic */ yc4 m(TarotReadingHistory tarotReadingHistory, yc4 yc4Var, int i) {
        Instant instantNow = Instant.now();
        instantNow.getClass();
        if ((i & 4) != 0) {
            yc4Var = null;
        }
        return l(tarotReadingHistory, instantNow, yc4Var);
    }

    public static u09 n(u09 u09Var) {
        ex5 ex5VarF = oz3.f(u09Var);
        String str = qf7.a;
        dx5 dx5VarI = qf7.i(ex5VarF);
        if (dx5VarI != null) {
            return qz3.e(u09Var).j(dx5VarI);
        }
        r3.m(u09Var, " is not a read-only collection", "Given class ");
        return null;
    }

    public static od3 o(czc czcVar, aw2 aw2Var, x16 x16Var) {
        aw2Var.getClass();
        return new od3(new sd5(czcVar, new hl4(16), x16Var), t72.H(new lb3(pu4.a, null)), new eu4(15), aw2Var);
    }

    public static pd0 p(List list, w09 w09Var, jua juaVar) {
        List listJ1 = s72.j1(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = listJ1.iterator();
        while (it.hasNext()) {
            bl2 bl2VarR = r(null, it.next());
            if (bl2VarR != null) {
                arrayList.add(bl2VarR);
            }
        }
        return w09Var != null ? new z8f(arrayList, w09Var.f().r(juaVar)) : new pd0(arrayList, new x(14, juaVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [pu4] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.util.ArrayList] */
    public static bl2 r(x09 x09Var, Object obj) {
        if (obj instanceof Byte) {
            return new c71(((Number) obj).byteValue());
        }
        if (obj instanceof Short) {
            return new bfd(((Number) obj).shortValue());
        }
        if (obj instanceof Integer) {
            return new g77(((Number) obj).intValue());
        }
        if (obj instanceof Long) {
            return new hg8(((Number) obj).longValue());
        }
        if (obj instanceof Character) {
            return new jx1((Character) obj);
        }
        if (obj instanceof Float) {
            return new h11(((Number) obj).floatValue());
        }
        if (obj instanceof Double) {
            return new h11(((Number) obj).doubleValue());
        }
        if (obj instanceof Boolean) {
            return new h11((Boolean) obj);
        }
        if (obj instanceof String) {
            return new t4e((String) obj);
        }
        boolean z2 = obj instanceof byte[];
        ?? H = pu4.a;
        int i = 0;
        if (z2) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length;
            if (length != 0) {
                if (length != 1) {
                    H = new ArrayList(bArr.length);
                    int length2 = bArr.length;
                    while (i < length2) {
                        H.add(Byte.valueOf(bArr[i]));
                        i++;
                    }
                } else {
                    H = t72.H(Byte.valueOf(bArr[0]));
                }
            }
            return p(H, x09Var, jua.BYTE);
        }
        if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length3 = sArr.length;
            if (length3 != 0) {
                if (length3 != 1) {
                    H = new ArrayList(sArr.length);
                    int length4 = sArr.length;
                    while (i < length4) {
                        H.add(Short.valueOf(sArr[i]));
                        i++;
                    }
                } else {
                    H = t72.H(Short.valueOf(sArr[0]));
                }
            }
            return p(H, x09Var, jua.SHORT);
        }
        if (obj instanceof int[]) {
            return p(qd0.E0((int[]) obj), x09Var, jua.INT);
        }
        if (obj instanceof long[]) {
            return p(qd0.F0((long[]) obj), x09Var, jua.LONG);
        }
        if (!(obj instanceof char[])) {
            if (obj instanceof float[]) {
                return p(qd0.D0((float[]) obj), x09Var, jua.FLOAT);
            }
            if (obj instanceof double[]) {
                return p(qd0.C0((double[]) obj), x09Var, jua.DOUBLE);
            }
            if (obj instanceof boolean[]) {
                return p(qd0.H0((boolean[]) obj), x09Var, jua.BOOLEAN);
            }
            if (obj == null) {
                return new sj9(null);
            }
            return null;
        }
        char[] cArr = (char[]) obj;
        int length5 = cArr.length;
        if (length5 != 0) {
            if (length5 != 1) {
                H = new ArrayList(cArr.length);
                int length6 = cArr.length;
                while (i < length6) {
                    H.add(Character.valueOf(cArr[i]));
                    i++;
                }
            } else {
                H = t72.H(Character.valueOf(cArr[0]));
            }
        }
        return p(H, x09Var, jua.CHAR);
    }

    public static List u(TarotReadingSpreadHistory tarotReadingSpreadHistory, TarotReadingBody tarotReadingBody) {
        ArrayList arrayList;
        List<SelectedCard> userSelectedCards;
        List<SpreadDetail> details;
        UserSelectedSpread userSelectedSpread = tarotReadingSpreadHistory.getUserSelectedSpread();
        if (userSelectedSpread == null || (details = userSelectedSpread.getDetails()) == null) {
            arrayList = null;
        } else {
            ArrayList<SpreadDetailCard> arrayList2 = new ArrayList();
            Iterator<T> it = details.iterator();
            while (it.hasNext()) {
                SpreadDetailCard card = ((SpreadDetail) it.next()).getCard();
                if (card != null) {
                    arrayList2.add(card);
                }
            }
            arrayList = new ArrayList();
            for (SpreadDetailCard spreadDetailCard : arrayList2) {
                TarotCardType tarotCardTypeF = F(spreadDetailCard.getKey());
                TarotCardChoice tarotCardChoice = tarotCardTypeF != null ? new TarotCardChoice(tarotCardTypeF, spreadDetailCard.getDirection() == 0, (String) null, 4, (rp3) null) : null;
                if (tarotCardChoice != null) {
                    arrayList.add(tarotCardChoice);
                }
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        if (tarotReadingBody == null || (userSelectedCards = tarotReadingBody.getUserSelectedCards()) == null) {
            return pu4.a;
        }
        ArrayList arrayList3 = new ArrayList();
        for (SelectedCard selectedCard : userSelectedCards) {
            TarotCardType tarotCardTypeF2 = F(selectedCard.getKey());
            TarotCardChoice tarotCardChoice2 = tarotCardTypeF2 != null ? new TarotCardChoice(tarotCardTypeF2, selectedCard.getDirection() == 0, (String) null, 4, (rp3) null) : null;
            if (tarotCardChoice2 != null) {
                arrayList3.add(tarotCardChoice2);
            }
        }
        return arrayList3;
    }

    public static List w(TarotReadingSpreadHistory tarotReadingSpreadHistory) {
        ArrayList arrayList;
        List<SpreadDetail> details;
        UserSelectedSpread userSelectedSpread = tarotReadingSpreadHistory.getUserSelectedSpread();
        if (userSelectedSpread == null || (details = userSelectedSpread.getDetails()) == null) {
            arrayList = null;
        } else {
            ArrayList<SpreadDetailPattern> arrayList2 = new ArrayList();
            Iterator<T> it = details.iterator();
            while (it.hasNext()) {
                SpreadDetailPattern pattern = ((SpreadDetail) it.next()).getPattern();
                if (pattern != null) {
                    arrayList2.add(pattern);
                }
            }
            arrayList = new ArrayList(t72.u(arrayList2, 10));
            for (SpreadDetailPattern spreadDetailPattern : arrayList2) {
                String name = spreadDetailPattern.getName();
                String str = "";
                if (name == null) {
                    name = "";
                }
                String desc = spreadDetailPattern.getDesc();
                if (desc != null) {
                    str = desc;
                }
                arrayList.add(new PatternData(name, str));
            }
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            return arrayList;
        }
        List<GeneratedSpreadPosition> generatedSpread = tarotReadingSpreadHistory.getGeneratedSpread();
        if (generatedSpread == null) {
            return pu4.a;
        }
        ArrayList arrayList3 = new ArrayList(t72.u(generatedSpread, 10));
        for (GeneratedSpreadPosition generatedSpreadPosition : generatedSpread) {
            arrayList3.add(new PatternData(generatedSpreadPosition.getName(), generatedSpreadPosition.getDescription()));
        }
        return arrayList3;
    }

    public static int y(jd4 jd4Var) {
        if (!(jd4Var instanceof hd4) && !(jd4Var instanceof id4) && !(jd4Var instanceof cd4)) {
            if (jd4Var instanceof gd4) {
                return 1;
            }
            if (jd4Var instanceof fd4) {
                return 2;
            }
            if (jd4Var instanceof zc4) {
                return 3;
            }
            if (jd4Var instanceof ad4) {
                return 4;
            }
            if (jd4Var instanceof bd4) {
                return 5;
            }
            ap.c();
        }
        return 0;
    }

    public static Instant z(String str) {
        Object dzbVar;
        if (str == null) {
            return null;
        }
        if (v4e.Q(str)) {
            str = null;
        }
        if (str == null) {
            return null;
        }
        try {
            dzbVar = Instant.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        return (Instant) (dzbVar instanceof dzb ? null : dzbVar);
    }

    public boolean G(rr5 rr5Var) {
        String str = rr5Var.p;
        return "application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str);
    }

    @Override // defpackage.t6e
    public boolean N(Object obj, Object obj2) {
        return false;
    }

    @Override // defpackage.goe
    public void V(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-2101003086);
        int i2 = (l46Var.g(this) ? 32 : 16) | i;
        int i3 = 6;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            dd2Var.z(l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(this, dd2Var, i, i3);
        }
    }

    @Override // defpackage.qkf
    public Object a(jn1 jn1Var, xn2 xn2Var) {
        return Boolean.FALSE;
    }

    @Override // defpackage.fg
    public Collection b(u09 u09Var) {
        return pu4.a;
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        Object objR = hbcVar.r(new y3b(l01.class, Executor.class));
        objR.getClass();
        return t72.z((Executor) objR);
    }

    @Override // defpackage.fg
    public Collection d(u09 u09Var) {
        u09Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.qkf
    public boolean e() {
        return false;
    }

    @Override // defpackage.fg
    public Collection f(u09 u09Var) {
        return pu4.a;
    }

    @Override // defpackage.fg
    public Collection g(t99 t99Var, u09 u09Var) {
        u09Var.getClass();
        return pu4.a;
    }

    @Override // defpackage.t6e
    public void k(s6e s6eVar) {
        s6eVar.clear();
    }

    @Override // defpackage.m23
    public Iterable q(Object obj) {
        wn7[] wn7VarArr = bk7.v;
        return ((ea1) obj).a().l();
    }

    public fbc s(rr5 rr5Var) {
        String str = rr5Var.p;
        if (str != null) {
            int i = 1;
            int i2 = 0;
            switch (str) {
                case "application/vnd.dvb.ait":
                    return new sa0(i2);
                case "application/x-icy":
                    return new mu6();
                case "application/id3":
                    return new qu6(null);
                case "application/x-emsg":
                    return new sa0(i);
                case "application/x-scte35":
                    return new wud();
            }
        }
        qc0.j(ub3.i("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    public v88 t(Context context, String str, WorkerParameters workerParameters) {
        str.getClass();
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str).asSubclass(v88.class);
            clsAsSubclass.getClass();
            try {
                Object objNewInstance = clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                objNewInstance.getClass();
                v88 v88Var = (v88) objNewInstance;
                if (!v88Var.d) {
                    return v88Var;
                }
                throw new IllegalStateException("WorkerFactory (" + getClass().getName() + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                ff8.h().g(rbg.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            ff8.h().g(rbg.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public String toString() {
        switch (this.a) {
            case 22:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.cu2
    public Object v(Object obj) {
        switch (this.a) {
            case 4:
                vyb vybVar = (vyb) obj;
                try {
                    f41 f41Var = new f41();
                    vybVar.P0().a0(f41Var);
                    return new tyb(vybVar.l(), vybVar.h(), f41Var);
                } finally {
                    vybVar.close();
                }
            default:
                ((vyb) obj).close();
                return wef.a;
        }
    }

    @Override // defpackage.yrf
    public Object x(cj7 cj7Var, float f2) {
        switch (this.a) {
            case 14:
                return Float.valueOf(lj7.d(cj7Var) * f2);
            case 26:
                return lj7.b(cj7Var, f2);
            default:
                int iL = cj7Var.l();
                if (iL == 1) {
                    return lj7.b(cj7Var, f2);
                }
                if (iL == 3) {
                    return lj7.b(cj7Var, f2);
                }
                if (iL != 7) {
                    qc0.j("Cannot convert json to point. Next token is ".concat(ub3.w(iL)));
                    return null;
                }
                PointF pointF = new PointF(((float) cj7Var.nextDouble()) * f2, ((float) cj7Var.nextDouble()) * f2);
                while (cj7Var.hasNext()) {
                    cj7Var.skipValue();
                }
                return pointF;
        }
    }
}
