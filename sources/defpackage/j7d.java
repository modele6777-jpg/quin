package defpackage;

import ai.askquin.R;
import ai.askquin.ui.share.SharedConversationEntry;
import ai.askquin.ui.share.SharedConversationEntryType;
import ai.askquin.ui.share.SharedDivination;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j7d {
    static {
        List listI = t72.I(new TarotCardChoice(TarotCardType.THE_FOOL, false, "Past"), new TarotCardChoice(TarotCardType.THE_HIGH_PRIESTESS, true, "Present"), new TarotCardChoice(TarotCardType.THE_CHARIOT, false, "Future"), new TarotCardChoice(TarotCardType.TWO_OF_SWORDS, true, "Advice"));
        TarotCardType tarotCardType = TarotCardType.NINE_OF_SWORDS;
        t72.I(new SharedConversationEntry(SharedConversationEntryType.User, "What should I focus on first?", (List) null, 4, (rp3) null), new SharedConversationEntry(SharedConversationEntryType.ClarifyingCard, "The most important next step", t72.H(new TarotCardChoice(tarotCardType, true, "Clarifier"))), new SharedConversationEntry(SharedConversationEntryType.Assistant, "Start with the conversation you have been avoiding and set one clear boundary.", (List) null, 4, (rp3) null));
        s72.Q0(listI, t72.I(new TarotCardChoice(TarotCardType.STRENGTH, false, "Challenge"), new TarotCardChoice(TarotCardType.THE_LOVERS, false, "Support"), new TarotCardChoice(TarotCardType.ACE_OF_PENTACLES, false, "Opportunity"), new TarotCardChoice(TarotCardType.KING_OF_CUPS, false, "Context"), new TarotCardChoice(TarotCardType.THE_STAR, false, "Hope"), new TarotCardChoice(tarotCardType, true, "Next Step"), new TarotCardChoice(TarotCardType.FOUR_OF_WANDS, false, "Outcome")));
    }

    public static final void a(j09 j09Var, final a26 a26Var, final bd4 bd4Var, List list, final List list2, boolean z, l46 l46Var, int i) {
        int i2;
        int i3;
        int i4;
        j09 j09VarD0;
        boolean z2;
        l46Var.h0(1409415239);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(a26Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(bd4Var) : l46Var.i(bd4Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? l46Var.g(list) : l46Var.i(list) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? l46Var.g(list2) : l46Var.i(list2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.h(z) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            final boolean zBooleanValue = ((Boolean) l46Var.k(sad.b)).booleanValue();
            final int iIntValue = ((Number) l46Var.k(sad.c)).intValue();
            final boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            dd4 dd4Var = bd4Var.b;
            ad4 ad4Var = dd4Var instanceof ad4 ? (ad4) dd4Var : null;
            List list3 = ad4Var != null ? ad4Var.b : null;
            if (list3 == null) {
                list3 = pu4.a;
            }
            List list4 = list3;
            boolean z3 = (i2 & 7168) == 2048 || ((i2 & 4096) != 0 && l46Var.g(list));
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z3 || objR == obj) {
                objR = s72.c1(list, 3);
                l46Var.p0(objR);
            }
            final List list5 = (List) objR;
            int size = list5.size() + list4.size();
            Iterator it = list2.iterator();
            int size2 = 0;
            while (it.hasNext()) {
                size2 = ((SharedConversationEntry) it.next()).getCards().size() + size2;
            }
            int i5 = size + size2;
            boolean zG = ((i2 & 57344) == 16384 || ((i2 & 32768) != 0 && l46Var.g(list2))) | l46Var.g(list4) | l46Var.g(list5);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                i3 = 0;
                objR2 = kv2.f(0, l46Var);
            } else {
                i3 = 0;
            }
            final s69 s69Var = (s69) objR2;
            final boolean zA = sad.a(i5, ((sz9) s69Var).j(), l46Var, i3);
            boolean zG2 = l46Var.g(s69Var);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = new pr1(s69Var, 11);
                l46Var.p0(objR3);
            }
            final a26 a26Var2 = (a26) objR3;
            boolean z4 = z || ((Boolean) l46Var.k(sad.a)).booleanValue();
            g09 g09Var = g09.a;
            j09 j09VarB0 = ynb.b0(z ? 0.0f : 58.0f, 0.0f, j09Var.D(z4 ? g09Var : b.c), 2);
            if (z4) {
                l46Var.f0(1533393263);
                i4 = 0;
                l46Var.r(false);
                j09VarD0 = g09Var;
            } else {
                i4 = 0;
                l46Var.f0(1533394284);
                j09VarD0 = mh3.d0(g09Var, mh3.T(l46Var), false, 14);
                l46Var.r(false);
            }
            j09 j09VarD = j09VarB0.D(j09VarD0);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, i4);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            if (z) {
                z2 = false;
                l46Var.f0(1062374097);
            } else {
                ib8.r(20.0f, 1004100527, l46Var, l46Var, g09Var);
                z2 = false;
            }
            l46Var.r(z2);
            boolean z5 = z2;
            c(af1.b0(-1007225539, new l26() { // from class: i7d
                /* JADX WARN: Code duplicated, block: B:138:0x0495  */
                /* JADX WARN: Code duplicated, block: B:75:0x0186  */
                /* JADX WARN: Code duplicated, block: B:77:0x018c  */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r15v17 */
                /* JADX WARN: Type inference failed for: r15v18, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r15v19 */
                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) throws IOException {
                    int i6;
                    int size3;
                    Object obj4;
                    long jA;
                    Object obj5;
                    p7d p7dVar;
                    ?? r15;
                    long j;
                    boolean z6;
                    i8c i8cVar;
                    r7d r7dVarX;
                    r7d r7dVar;
                    r7d p7dVar2;
                    final x4d x4dVarC;
                    boolean z7;
                    long j2;
                    Object obj6;
                    a26 a26Var3;
                    Object obj7;
                    final x4d x4dVar;
                    final long jB;
                    long jG;
                    long jA2;
                    boolean z8;
                    boolean zG3;
                    Object obj8;
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue2 = ((Integer) obj3).intValue();
                    boolean z9 = false;
                    int i7 = 1;
                    if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                        bd4 bd4Var2 = bd4Var;
                        bd4Var2.getClass();
                        List list6 = list2;
                        list6.getClass();
                        a26 a26Var4 = a26Var2;
                        a26Var4.getClass();
                        String str = bd4Var2.a;
                        boolean zG4 = l46Var2.g(str);
                        Object objR4 = l46Var2.R();
                        i8c i8cVar2 = sf2.a;
                        if (zG4 || objR4 == i8cVar2) {
                            str.getClass();
                            ArrayList arrayListK = t72.K(0);
                            int i8 = 0;
                            for (int i9 = 0; i9 < str.length(); i9++) {
                                i8++;
                                if (str.charAt(i9) == '\n') {
                                    arrayListK.add(Integer.valueOf(i8));
                                }
                            }
                            g0a g0aVar = new g0a();
                            g0aVar.h = new oo3(29);
                            g0aVar.i = 2;
                            bg4 bg4VarC = new bt6(g0aVar).c(str);
                            ArrayList arrayList = new ArrayList();
                            sf9 sf9Var = bg4VarC.b;
                            while (sf9Var != null) {
                                List listD = sf9Var.d();
                                listD.getClass();
                                if (!listD.isEmpty()) {
                                    vtd vtdVar = (vtd) s72.v0(listD);
                                    vtd vtdVar2 = (vtd) s72.F0(listD);
                                    int iIntValue3 = ((Number) arrayListK.get(vtdVar.a)).intValue() + vtdVar.b;
                                    int iIntValue4 = ((Number) arrayListK.get(vtdVar2.a)).intValue() + vtdVar2.b + vtdVar2.d;
                                    int length = str.length();
                                    if (iIntValue4 > length) {
                                        iIntValue4 = length;
                                    }
                                    arrayList.add(str.substring(iIntValue3, iIntValue4));
                                }
                                sf9Var = sf9Var.e;
                                i7 = i7;
                            }
                            i6 = i7;
                            ArrayList arrayList2 = new ArrayList();
                            StringBuilder sb = new StringBuilder();
                            Iterator it2 = arrayList.iterator();
                            loop4: while (true) {
                                int i10 = 0;
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break loop4;
                                    }
                                    String str2 = (String) it2.next();
                                    boolean zC = c5e.C(str2, "```", false);
                                    int i11 = (c5e.C(str2, "- ", false) || c5e.C(str2, "* ", false) || new rob("\\d+\\..+").g(str2)) ? i6 : 0;
                                    int i12 = (zC || i11 != 0) ? 0 : i6;
                                    if (zC || i11 != 0) {
                                        if (sb.length() > 0) {
                                            arrayList2.add(sb.toString());
                                            sb.setLength(0);
                                        }
                                        arrayList2.add(str2);
                                    } else if (i12 != 0) {
                                        if (i10 != 0) {
                                            int i13 = 0;
                                            while (true) {
                                                if (i13 >= sb.length()) {
                                                    size3 = v4e.c0(sb, new String[]{" "}, 6).size();
                                                    break;
                                                }
                                                char cCharAt = sb.charAt(i13);
                                                if ((12352 <= cCharAt && cCharAt < 12544) || ((19968 <= cCharAt && cCharAt < 40960) || (44032 <= cCharAt && cCharAt < 55216))) {
                                                    size3 = sb.length();
                                                    break;
                                                }
                                                i13++;
                                            }
                                            if (size3 < 20) {
                                                sb.append("\n\n");
                                                sb.append(str2);
                                            } else {
                                                if (sb.length() > 0) {
                                                    arrayList2.add(sb.toString());
                                                }
                                                sb.setLength(0);
                                                sb.append(str2);
                                            }
                                        } else {
                                            if (sb.length() > 0) {
                                                arrayList2.add(sb.toString());
                                            }
                                            sb.setLength(0);
                                            sb.append(str2);
                                        }
                                        i10 = i6;
                                    }
                                }
                            }
                            if (sb.length() > 0) {
                                arrayList2.add(sb.toString());
                            }
                            String strD0 = s72.D0(arrayList2, "\n\n", null, null, null, 62);
                            l46Var2.p0(strD0);
                            obj4 = strD0;
                        } else {
                            i6 = 1;
                            obj4 = objR4;
                        }
                        String str3 = (String) obj4;
                        mue mueVar = pue.a;
                        mue mueVarD = pue.d(l46Var2);
                        long jL = w6c.l(24);
                        ar5 ar5VarS = jgb.S(l46Var2);
                        boolean z10 = zF;
                        if (z10) {
                            l46Var2.f0(1718945930);
                            jA = l8b.e(l46Var2);
                        } else {
                            l46Var2.f0(1718946824);
                            jA = l8b.a(l46Var2);
                        }
                        l46Var2.r(false);
                        mue mueVarA = mue.a(mueVarD, jA, 0L, ar5VarS, null, 0L, null, 0, jL, null, null, 16646138);
                        p7d p7dVar3 = new p7d(t72.I(new v7d(new k00(afc.q(R.string.overview_question, l46Var2)), mueVarA, false), new v7d(new k00(((ad4) bd4Var2.b).a.a), mue.a(pue.o(l46Var2), l8b.b(l46Var2), 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, w6c.k(28.35d), null, null, 16646110), false)), null, 12.0f, null, 0.0f, null, null, 250);
                        String strQ = afc.q(R.string.overview_deck, l46Var2);
                        mue mueVarJ = pue.j(l46Var2);
                        long jB2 = l8b.b(l46Var2);
                        v7d v7dVar = new v7d(new k00(strQ), mueVarA, false);
                        i8c i8cVar3 = i8cVar2;
                        u7d u7dVar = new u7d(af1.b0(-1969135833, new mt2(bd4Var2, list5, a26Var4, z10, mueVarJ, jB2), l46Var2));
                        r7d[] r7dVarArr = new r7d[2];
                        r7dVarArr[0] = v7dVar;
                        r7dVarArr[i6] = u7dVar;
                        p7d p7dVar4 = new p7d(t72.I(r7dVarArr), null, 12.0f, null, 0.0f, null, null, 250);
                        l46Var2.f0(1718992648);
                        c78 c78VarW = t72.w();
                        c78VarW.add(o5c.m(str3, l46Var2));
                        if (ca2.a.a()) {
                            c78VarW.add(new u7d(od4.g));
                        }
                        c78 c78VarN = c78VarW.n();
                        l46Var2.r(false);
                        p7d p7dVar5 = new p7d(c78VarN, null, 0.0f, null, 0.0f, null, null, 254);
                        l46Var2.f0(1718999366);
                        ArrayList arrayList3 = new ArrayList(t72.u(list6, 10));
                        Iterator it3 = list6.iterator();
                        while (it3.hasNext()) {
                            SharedConversationEntry sharedConversationEntry = (SharedConversationEntry) it3.next();
                            int i14 = SharedConversationEntry.$stable;
                            int i15 = st2.a[sharedConversationEntry.getType().ordinal()];
                            if (i15 != i6) {
                                if (i15 == 2) {
                                    it3 = it3;
                                    boolean z11 = z9;
                                    i8cVar = i8cVar3;
                                    l46Var2.f0(-1058321418);
                                    String text = sharedConversationEntry.getText();
                                    if (z10) {
                                        l46Var2.f0(-1579546215);
                                        l46Var2.r(z11);
                                        x4dVarC = new y02(3);
                                    } else {
                                        l46Var2.f0(-1721264972);
                                        x4dVarC = y6c.c(((s5d) l46Var2.k(u5d.a)).e, null, new zi4(0.0f), null, null, 13);
                                        l46Var2.r(false);
                                    }
                                    pr4 pr4Var = l8b.a;
                                    final long j3 = ((e8b) l46Var2.k(pr4Var)).m;
                                    final long j4 = ((e8b) l46Var2.k(pr4Var)).t;
                                    mue mueVar2 = (mue) l46Var2.k(nte.a);
                                    long jL2 = w6c.l(17);
                                    long jL3 = w6c.l(27);
                                    long jK = w6c.k(0.1d);
                                    cq5 cq5Var = cr5.h;
                                    ar5 ar5Var = ar5.b;
                                    if (z10) {
                                        l46Var2.f0(-1579532914);
                                        j2 = ((m82) l46Var2.k(o82.a)).q;
                                        z7 = false;
                                    } else {
                                        z7 = false;
                                        l46Var2.f0(-1579531860);
                                        j2 = ((y72) l46Var2.k(em2.a)).a;
                                    }
                                    l46Var2.r(z7);
                                    p7dVar5 = p7dVar5;
                                    List listH = t72.H(new v7d(new k00(text), mue.a(mueVar2, j2, jL2, ar5Var, cq5Var, jK, null, 0, jL3, null, null, 16645976), z7));
                                    float f = z10 != 0 ? 16.0f : 24.0f;
                                    float f2 = z10 != 0 ? 12.0f : 16.0f;
                                    bx9 bx9Var = new bx9(f, f2, f, f2);
                                    a26 a26Var5 = null;
                                    if (z10 != 0) {
                                        l46Var2.f0(-1720536008);
                                        l46Var2.r(false);
                                        a26Var3 = null;
                                    } else {
                                        l46Var2.f0(-1720523576);
                                        boolean zG5 = l46Var2.g(x4dVarC) | l46Var2.f(j3);
                                        Object objR5 = l46Var2.R();
                                        if (zG5 || objR5 == i8cVar) {
                                            obj6 = objR5;
                                            final int i16 = 1;
                                            a26 a26Var6 = new a26() { // from class: nt2
                                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                 */
                                                @Override // defpackage.a26
                                                public final Object d(Object obj9) {
                                                    int i17 = i16;
                                                    wef wefVar = wef.a;
                                                    x4d x4dVar2 = x4dVarC;
                                                    switch (i17) {
                                                        case 0:
                                                            sn4 sn4Var = (sn4) obj9;
                                                            sn4Var.getClass();
                                                            rs0.w(sn4Var, x4dVar2.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var), j3, null, 60);
                                                            break;
                                                        case 1:
                                                            sn4 sn4Var2 = (sn4) obj9;
                                                            sn4Var2.getClass();
                                                            rs0.w(sn4Var2, x4dVar2.a(sn4Var2.f(), sn4Var2.getLayoutDirection(), sn4Var2), j3, null, 60);
                                                            break;
                                                        default:
                                                            sn4 sn4Var3 = (sn4) obj9;
                                                            sn4Var3.getClass();
                                                            z7f.D(sn4Var3, x4dVar2, j3, 0.5f);
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var2.p0(a26Var6);
                                            obj6 = a26Var6;
                                        }
                                        l46Var2.r(false);
                                        a26Var3 = (a26) obj6;
                                    }
                                    if (z10 != 0) {
                                        l46Var2.f0(-1720406427);
                                        boolean zG6 = l46Var2.g(x4dVarC) | l46Var2.f(j4);
                                        Object objR6 = l46Var2.R();
                                        if (zG6 || objR6 == i8cVar) {
                                            obj7 = objR6;
                                            final int i17 = 2;
                                            a26 a26Var7 = new a26() { // from class: nt2
                                                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                                 */
                                                @Override // defpackage.a26
                                                public final Object d(Object obj9) {
                                                    int i18 = i17;
                                                    wef wefVar = wef.a;
                                                    x4d x4dVar2 = x4dVarC;
                                                    switch (i18) {
                                                        case 0:
                                                            sn4 sn4Var = (sn4) obj9;
                                                            sn4Var.getClass();
                                                            rs0.w(sn4Var, x4dVar2.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var), j4, null, 60);
                                                            break;
                                                        case 1:
                                                            sn4 sn4Var2 = (sn4) obj9;
                                                            sn4Var2.getClass();
                                                            rs0.w(sn4Var2, x4dVar2.a(sn4Var2.f(), sn4Var2.getLayoutDirection(), sn4Var2), j4, null, 60);
                                                            break;
                                                        default:
                                                            sn4 sn4Var3 = (sn4) obj9;
                                                            sn4Var3.getClass();
                                                            z7f.D(sn4Var3, x4dVar2, j4, 0.5f);
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var2.p0(a26Var7);
                                            obj7 = a26Var7;
                                        }
                                        a26Var5 = (a26) obj7;
                                        l46Var2.r(false);
                                    } else {
                                        l46Var2.f0(-1720346536);
                                        l46Var2.r(false);
                                    }
                                    p7dVar2 = new p7d(t72.H(new p7d(listH, bx9Var, 0.0f, null, 0.0f, a26Var3, a26Var5, 44)), null, 0.0f, ndb.E0, 0.0f, null, null, 246);
                                    z6 = false;
                                    l46Var2.r(false);
                                } else {
                                    if (i15 != 3) {
                                        throw tec.d(-1058326757, l46Var2, z9);
                                    }
                                    l46Var2.f0(1551905790);
                                    if (z10) {
                                        l46Var2.f0(-1058317540);
                                        l46Var2.r(z9);
                                        x4dVar = g21.f;
                                    } else {
                                        l46Var2.f0(-1058316460);
                                        x4dVar = eze.a(l46Var2).a.j;
                                        l46Var2.r(z9);
                                    }
                                    if (z10) {
                                        l46Var2.f0(-1058314857);
                                        long jH = l8b.h(l46Var2);
                                        l46Var2.r(z9);
                                        jB = jH;
                                    } else {
                                        l46Var2.f0(-1058313631);
                                        jB = y72.b(l8b.g(l46Var2), 0.48f);
                                        l46Var2.r(z9);
                                    }
                                    if (z10) {
                                        l46Var2.f0(-1058311740);
                                        jG = l8b.m(l46Var2);
                                    } else {
                                        l46Var2.f0(-1058310627);
                                        jG = l8b.g(l46Var2);
                                    }
                                    l46Var2.r(z9);
                                    long j5 = jG;
                                    boolean z12 = z9;
                                    k00 k00Var = new k00(afc.q(R.string.follow_up_clarifying_title, l46Var2));
                                    mue mueVar3 = pue.a;
                                    mue mueVarD2 = pue.d(l46Var2);
                                    long jL4 = w6c.l(z12 ? 1 : 0);
                                    if (z10) {
                                        l46Var2.f0(-1058301379);
                                        jA2 = l8b.e(l46Var2);
                                        z8 = z12 ? 1 : 0;
                                    } else {
                                        l46Var2.f0(-1058300485);
                                        jA2 = l8b.a(l46Var2);
                                        z8 = false;
                                    }
                                    l46Var2.r(z8);
                                    List listI = t72.I(new v7d(k00Var, mue.a(mueVarD2, jA2, 0L, null, null, jL4, null, 0, 0L, null, null, 16777086), false), new v7d(new k00(sharedConversationEntry.getText()), mue.a(pue.c(l46Var2), l8b.b(l46Var2), 0L, null, null, w6c.l(0), null, 0, 0L, null, null, 16777086), false), new u7d(af1.b0(2110789077, new h8(23, sharedConversationEntry, a26Var4), l46Var2)));
                                    bx9 bx9Var2 = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
                                    boolean zG7 = l46Var2.g(x4dVar) | l46Var2.f(jB);
                                    Object objR7 = l46Var2.R();
                                    if (zG7) {
                                        i8cVar = i8cVar3;
                                    } else {
                                        i8cVar = i8cVar3;
                                        if (objR7 == i8cVar) {
                                        }
                                        obj = objR7;
                                        a26 a26Var8 = (a26) obj;
                                        zG3 = l46Var2.g(x4dVar) | l46Var2.f(j5) | ((((i14 & 112) ^ 48) <= 32 && l46Var2.h(z10)) || (i14 & 48) == 32);
                                        Object objR8 = l46Var2.R();
                                        obj8 = objR8;
                                        if (zG3 || objR8 == i8cVar) {
                                            ev evVar = new ev(x4dVar, j5, z10);
                                            l46Var2.p0(evVar);
                                            obj8 = evVar;
                                        }
                                        p7d p7dVar6 = new p7d(listI, bx9Var2, 12.0f, null, 0.0f, a26Var8, (a26) obj8, 56);
                                        l46Var2.r(false);
                                        z6 = false;
                                        z10 = z10;
                                        r7dVar = p7dVar6;
                                    }
                                    obj = objR7;
                                    final int i18 = 0;
                                    a26 a26Var9 = new a26() { // from class: nt2
                                        /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                                        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                         */
                                        @Override // defpackage.a26
                                        public final Object d(Object obj9) {
                                            int i19 = i18;
                                            wef wefVar = wef.a;
                                            x4d x4dVar2 = x4dVar;
                                            switch (i19) {
                                                case 0:
                                                    sn4 sn4Var = (sn4) obj9;
                                                    sn4Var.getClass();
                                                    rs0.w(sn4Var, x4dVar2.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var), jB, null, 60);
                                                    break;
                                                case 1:
                                                    sn4 sn4Var2 = (sn4) obj9;
                                                    sn4Var2.getClass();
                                                    rs0.w(sn4Var2, x4dVar2.a(sn4Var2.f(), sn4Var2.getLayoutDirection(), sn4Var2), jB, null, 60);
                                                    break;
                                                default:
                                                    sn4 sn4Var3 = (sn4) obj9;
                                                    sn4Var3.getClass();
                                                    z7f.D(sn4Var3, x4dVar2, jB, 0.5f);
                                                    break;
                                            }
                                            return wefVar;
                                        }
                                    };
                                    l46Var2.p0(a26Var9);
                                    Object obj9 = a26Var9;
                                    obj9 = objR7;
                                    a26 a26Var10 = (a26) obj9;
                                    zG3 = l46Var2.g(x4dVar) | l46Var2.f(j5) | ((((i14 & 112) ^ 48) <= 32 && l46Var2.h(z10)) || (i14 & 48) == 32);
                                    Object objR9 = l46Var2.R();
                                    obj8 = objR9;
                                    if (zG3) {
                                        ev evVar2 = new ev(x4dVar, j5, z10);
                                        l46Var2.p0(evVar2);
                                        obj8 = evVar2;
                                    } else {
                                        ev evVar3 = new ev(x4dVar, j5, z10);
                                        l46Var2.p0(evVar3);
                                        obj8 = evVar3;
                                    }
                                    p7d p7dVar7 = new p7d(listI, bx9Var2, 12.0f, null, 0.0f, a26Var10, (a26) obj8, 56);
                                    l46Var2.r(false);
                                    z6 = false;
                                    z10 = z10;
                                    r7dVar = p7dVar7;
                                }
                                arrayList3.add(p7dVar2);
                                i6 = 1;
                                i8cVar3 = i8cVar;
                                z9 = z6;
                                z10 = z10;
                                it3 = it3;
                                a26Var4 = a26Var4;
                                p7dVar5 = p7dVar5;
                            } else {
                                z6 = z9;
                                z10 = z10;
                                i8cVar = i8cVar3;
                                l46Var2.f0(1551621086);
                                r7d r7dVarM = o5c.m(sharedConversationEntry.getText(), l46Var2);
                                if (z10) {
                                    l46Var2.f0(-1058324106);
                                    r7dVarX = r7dVarM;
                                } else {
                                    l46Var2.f0(-1058323640);
                                    r7dVarX = z7f.x(r7dVarM, l46Var2);
                                }
                                l46Var2.r(z6);
                                r7dVar = r7dVarX;
                                l46Var2.r(z6);
                            }
                            p7dVar2 = r7dVar;
                            arrayList3.add(p7dVar2);
                            i6 = 1;
                            i8cVar3 = i8cVar;
                            z9 = z6;
                            z10 = z10;
                            it3 = it3;
                            a26Var4 = a26Var4;
                            p7dVar5 = p7dVar5;
                        }
                        boolean z13 = z9;
                        final boolean z14 = z10;
                        p7d p7dVar8 = p7dVar5;
                        i8c i8cVar4 = i8cVar3;
                        l46Var2.r(z13);
                        y6c y6cVarB = a7c.b(40.0f);
                        long jF = l8b.f(l46Var2);
                        long jM = l8b.m(l46Var2);
                        if (z14) {
                            l46Var2.f0(1749637939);
                            c78 c78VarW2 = t72.w();
                            c78VarW2.add(z7f.W(p7dVar3));
                            c78VarW2.add(z7f.a0(jM));
                            c78VarW2.add(z7f.W(p7dVar4));
                            c78VarW2.add(z7f.a0(jM));
                            c78VarW2.add(z7f.W(p7dVar8));
                            for (iy9 iy9Var : s72.r1(list6, arrayList3)) {
                                SharedConversationEntry sharedConversationEntry2 = (SharedConversationEntry) iy9Var.a();
                                r7d r7dVar2 = (r7d) iy9Var.b();
                                if (sharedConversationEntry2.getType() == SharedConversationEntryType.User) {
                                    c78VarW2.add(z7f.a0(jM));
                                }
                                c78VarW2.add(z7f.W(r7dVar2));
                            }
                            c78 c78VarN2 = c78VarW2.n();
                            bx9 bx9Var3 = new bx9(10.0f, 10.0f, 10.0f, 10.0f);
                            boolean zG8 = l46Var2.g(y6cVarB) | l46Var2.f(jF);
                            Object objR10 = l46Var2.R();
                            Object obj10 = objR10;
                            if (zG8 || objR10 == i8cVar4) {
                                ot2 ot2Var = new ot2(y6cVarB, jF, 2);
                                l46Var2.p0(ot2Var);
                                obj10 = ot2Var;
                            }
                            a26 a26Var11 = (a26) obj10;
                            boolean zG9 = l46Var2.g(y6cVarB) | l46Var2.f(jM);
                            Object objR11 = l46Var2.R();
                            Object obj11 = objR11;
                            if (zG9 || objR11 == i8cVar4) {
                                ot2 ot2Var2 = new ot2(y6cVarB, jM, 3);
                                l46Var2.p0(ot2Var2);
                                obj11 = ot2Var2;
                            }
                            p7dVar = new p7d(c78VarN2, bx9Var3, 0.0f, null, 0.0f, a26Var11, (a26) obj11, 60);
                            l46Var2.r(false);
                            r15 = 0;
                        } else {
                            l46Var2.f0(1750339221);
                            fy9 fy9VarA = od4.A(R.drawable.bg_iris, 0, l46Var2);
                            pr4 pr4Var2 = l8b.a;
                            long j6 = ((e8b) l46Var2.k(pr4Var2)).e;
                            long j7 = l8b.j(l46Var2);
                            long j8 = ((e8b) l46Var2.k(pr4Var2)).B;
                            l46Var2.f0(1719037097);
                            c78 c78VarW3 = t72.w();
                            c78VarW3.add(z7f.x(p7dVar3, l46Var2));
                            c78VarW3.add(z7f.x(p7dVar4, l46Var2));
                            c78VarW3.add(z7f.x(p7dVar8, l46Var2));
                            c78VarW3.addAll(arrayList3);
                            k00 k00Var2 = new k00(afc.q(R.string.tarot_sharing_tips, l46Var2));
                            mue mueVar4 = pue.a;
                            c78VarW3.add(new v7d(k00Var2, mue.a(pue.j(l46Var2), l8b.c(l46Var2), 0L, null, null, 0L, null, 3, 0L, null, null, 16744446), true));
                            c78 c78VarN3 = c78VarW3.n();
                            l46Var2.r(false);
                            bx9 bx9Var4 = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
                            boolean zG10 = l46Var2.g(y6cVarB) | l46Var2.f(j6) | l46Var2.i(fy9VarA) | l46Var2.f(j7);
                            Object objR12 = l46Var2.R();
                            if (zG10 || objR12 == i8cVar4) {
                                obj5 = objR12;
                                j11 j11Var = new j11(y6cVarB, j6, fy9VarA, j7);
                                l46Var2.p0(j11Var);
                                obj5 = j11Var;
                            }
                            a26 a26Var12 = (a26) obj5;
                            boolean zG11 = l46Var2.g(y6cVarB) | l46Var2.f(j8);
                            Object objR13 = l46Var2.R();
                            Object obj12 = objR13;
                            if (zG11 || objR13 == i8cVar4) {
                                ot2 ot2Var3 = new ot2(y6cVarB, j8, 4);
                                l46Var2.p0(ot2Var3);
                                obj12 = ot2Var3;
                            }
                            p7dVar = new p7d(c78VarN3, bx9Var4, 12.0f, null, 0.0f, a26Var12, (a26) obj12, 56);
                            r15 = 0;
                            l46Var2.r(false);
                        }
                        p7d p7dVar9 = p7dVar;
                        final fy9 fy9VarA2 = od4.A(z14 ? R.drawable.bg_unified_share_neo : R.drawable.bg_iris, r15, l46Var2);
                        if (z14) {
                            l46Var2.f0(1719065737);
                            l46Var2.r(r15);
                            j = jF;
                        } else {
                            l46Var2.f0(1719067202);
                            j = ((m82) l46Var2.k(o82.a)).a;
                            l46Var2.r(r15);
                        }
                        final long j9 = ((e8b) l46Var2.k(l8b.a)).e;
                        final float f3 = l46Var2.k(vgb.c) != null ? 0.7f : 1.0f;
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fy9VarA2.getE0() & 4294967295L)) / Float.intBitsToFloat((int) (fy9VarA2.getE0() >> 32));
                        dd2 dd2Var = od4.h;
                        jx0 jx0Var = ndb.Z;
                        List listI2 = t72.I(new p7d(t72.H(new u7d(dd2Var, jx0Var)), ynb.r(0.0f, 16.0f, 0.0f, z14 ? 16.0f : 0.0f, 5), 0.0f, jx0Var, 0.0f, null, null, 244), p7dVar9, new p7d(t72.H(new u7d(af1.b0(-1556145854, new l26() { // from class: pt2
                            @Override // defpackage.l26
                            public final Object z(Object obj13, Object obj14) {
                                l46 l46Var3 = (l46) obj13;
                                int iIntValue5 = ((Integer) obj14).intValue();
                                if (l46Var3.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                                    h7d.g(b.c(g09.a, 1.0f), 0L, 0, null, f3, l46Var3, 6, 14);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2))), ynb.r(0.0f, 16.0f, 0.0f, z14 ? 16.0f : 20.0f, 5), 0.0f, null, 0.0f, null, null, 252));
                        boolean zF2 = l46Var2.f(j) | l46Var2.i(fy9VarA2) | l46Var2.h(z14) | l46Var2.f(j9);
                        Object objR14 = l46Var2.R();
                        if (zF2 || objR14 == i8cVar4) {
                            final long j10 = j;
                            objR14 = new a26() { // from class: qt2
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r13v3 */
                                /* JADX WARN: Type inference failed for: r13v4 */
                                /* JADX WARN: Type inference failed for: r13v5, types: [float] */
                                /* JADX WARN: Type inference failed for: r13v6, types: [float] */
                                /* JADX WARN: Type inference failed for: r13v8 */
                                /* JADX WARN: Type inference failed for: r1v1, types: [sn4] */
                                /* JADX WARN: Type inference failed for: r1v11, types: [vd9] */
                                /* JADX WARN: Type inference failed for: r1v12, types: [sn4] */
                                /* JADX WARN: Type inference failed for: r1v14, types: [sn4] */
                                /* JADX WARN: Type inference failed for: r1v15 */
                                /* JADX WARN: Type inference failed for: r1v16 */
                                /* JADX WARN: Type inference failed for: r1v17 */
                                /* JADX WARN: Type inference failed for: r1v2 */
                                /* JADX WARN: Type inference failed for: r1v3 */
                                /* JADX WARN: Type inference failed for: r1v4 */
                                /* JADX WARN: Type inference failed for: r1v5 */
                                /* JADX WARN: Type inference failed for: r1v6 */
                                /* JADX WARN: Type inference failed for: r1v7 */
                                /* JADX WARN: Type inference failed for: r1v8, types: [sn4] */
                                /* JADX WARN: Type inference failed for: r5v16 */
                                /* JADX WARN: Type inference failed for: r5v17 */
                                /* JADX WARN: Type inference failed for: r5v23, types: [sn4] */
                                /* JADX WARN: Type inference failed for: r5v26, types: [vd9] */
                                /* JADX WARN: Type inference failed for: r5v27, types: [sn4] */
                                @Override // defpackage.a26
                                public final Object d(Object obj13) throws Throwable {
                                    ?? r5;
                                    ?? r1;
                                    ?? r13;
                                    float f4;
                                    char c;
                                    long j11;
                                    float f5;
                                    long j12 = j9;
                                    sn4 sn4Var = (sn4) obj13;
                                    sn4Var.getClass();
                                    sn4 sn4Var2 = sn4Var;
                                    sn4.y0(sn4Var2, j10, 0L, 0L, 0.0f, null, 0, 126);
                                    char c2 = ' ';
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var2.f() >> 32));
                                    fy9 fy9Var = fy9VarA2;
                                    long j13 = 4294967295L;
                                    float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (fy9Var.getE0() & 4294967295L)) * fIntBitsToFloat2) / Float.intBitsToFloat((int) (fy9Var.getE0() >> 32));
                                    float f6 = 0.0f;
                                    Iterator it4 = t72.I(Float.valueOf(0.0f), Float.valueOf(Float.intBitsToFloat((int) (sn4Var2.f() & 4294967295L)) - ym8.L(fIntBitsToFloat3))).iterator();
                                    ?? r2 = sn4Var2;
                                    while (it4.hasNext()) {
                                        float fFloatValue = ((Number) it4.next()).floatValue();
                                        ((vd9) r2.v0().c).I(f6, fFloatValue);
                                        if (z14) {
                                            try {
                                                long jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (r2.f() >> c2)));
                                                r5 = r2;
                                                r1 = -2147483648;
                                                try {
                                                    fy9.h(fy9Var, r5, (jFloatToRawIntBits << c2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j13), 0.2f, 4);
                                                    c = c2;
                                                    j11 = j13;
                                                    fy9Var = fy9Var;
                                                    r13 = -2147483648;
                                                    r1 = r5;
                                                    f5 = f6;
                                                    f4 = fFloatValue;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    r13 = r1;
                                                    r1 = r5;
                                                    f4 = fFloatValue;
                                                    ((vd9) r1.v0().c).I(r13, -f4);
                                                    throw th;
                                                }
                                            } catch (Throwable th2) {
                                                th = th2;
                                                r5 = r2;
                                                r1 = -2147483648;
                                            }
                                        } else {
                                            ?? r6 = r2;
                                            fy9 fy9Var2 = fy9Var;
                                            vl1 vl1VarP = r6.v0().p();
                                            hkb hkbVar = new hkb(f6, f6, Float.intBitsToFloat((int) (r6.f() >> c2)), fIntBitsToFloat3);
                                            rt rtVarH = urg.h();
                                            rtVarH.d(0.6f);
                                            vl1VarP.l(hkbVar, rtVarH);
                                            long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (r6.f() >> c2)))) << c2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j13);
                                            r1 = r6;
                                            c = c2;
                                            f4 = fFloatValue;
                                            long j14 = j13;
                                            r13 = -2147483648;
                                            f5 = f6;
                                            j11 = j14;
                                            try {
                                                sn4.y0(r1, j12, 0L, jFloatToRawIntBits2, 0.0f, null, 0, 122);
                                                fy9Var = fy9Var2;
                                                try {
                                                    fy9.h(fy9Var, r1, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j11) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r1.f() >> c))) << c), 0.0f, 6);
                                                    vl1VarP.o();
                                                } catch (Throwable th3) {
                                                    th = th3;
                                                    r1 = r1;
                                                    ((vd9) r1.v0().c).I(r13, -f4);
                                                    throw th;
                                                }
                                            } catch (Throwable th4) {
                                                th = th4;
                                            }
                                        }
                                        ((vd9) r1.v0().c).I(r13, -f4);
                                        c2 = c;
                                        f6 = f5;
                                        j13 = j11;
                                        r2 = r1;
                                    }
                                    return wef.a;
                                }
                            };
                            l46Var2.p0(objR14);
                        }
                        fdc.c(new p7d(listI2, null, 0.0f, null, fIntBitsToFloat, (a26) objR14, null, 158), (zBooleanValue && zA) ? 1 : r15, iIntValue, Integer.valueOf(((sz9) s69Var).j()), a26Var, null, l46Var2, 0);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 6);
            if (z) {
                l46Var.f0(1062901841);
            } else {
                ib8.r(40.0f, 1004117551, l46Var, l46Var, g09Var);
            }
            l46Var.r(z5);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(j09Var, a26Var, bd4Var, list, list2, z, i);
        }
    }

    public static final void b(j09 j09Var, SharedDivination sharedDivination, a26 a26Var, l46 l46Var, int i) {
        int i2;
        a26 a26Var2;
        j09Var.getClass();
        sharedDivination.getClass();
        l46Var.h0(-2081996453);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(sharedDivination) : l46Var.i(sharedDivination) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(true) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            a26Var2 = a26Var;
            i2 |= l46Var.i(a26Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            a26Var2 = a26Var;
        }
        boolean z = false;
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            if ((i2 & 112) == 32 || ((i2 & 64) != 0 && l46Var.g(sharedDivination))) {
                z = true;
            }
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new bd4(sharedDivination.getContent(), new ad4(new zc4(sharedDivination.getQuestion(), "", pu4.a, new gd4(sharedDivination.getQuestion(), 247), null, null, null, 112), sharedDivination.getCards(), null, null, null));
                l46Var.p0(objR);
            }
            a(j09Var, a26Var2, (bd4) objR, sharedDivination.getExtraCards(), sharedDivination.getFollowUpEntries(), true, l46Var, (i2 & 14) | ((i2 >> 6) & 112) | 512 | ((i2 << 9) & 458752));
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, j09Var, sharedDivination, a26Var, 15);
        }
    }

    public static final void c(dd2 dd2Var, l46 l46Var, int i) {
        dd2 dd2Var2;
        l46 l46Var2;
        boolean z;
        l46Var.h0(-1249290451);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            if (k8b.e((e8b) l46Var.k(l8b.a))) {
                l46Var.f0(2022722812);
                z = !g21.S(l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(-1720101031);
                l46Var.r(false);
                z = false;
            }
            if (z) {
                l46Var.f0(-1720083418);
                dd2Var2 = dd2Var;
                l46Var2 = l46Var;
                o7c.a(false, null, dd2Var2, l46Var2, 390, 2);
                l46Var2.r(false);
            } else {
                dd2Var2 = dd2Var;
                l46Var2 = l46Var;
                l46Var2.f0(-1720000958);
                dd2Var2.z(l46Var2, 6);
                l46Var2.r(false);
            }
        } else {
            dd2Var2 = dd2Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var2, i, 28);
        }
    }
}
