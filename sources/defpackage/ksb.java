package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.personality.ShortCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ksb {
    public static final dsb a;

    static {
        TarotCardType tarotCardType = TarotCardType.JUSTICE;
        a = new dsb(new TarotCardChoice(tarotCardType, true, (String) null, 4, (rp3) null), new ShortCard("愿你化万千可能，成就心中奇迹", "与你最相配CP是", "创意敏捷", "设计师", "主动真挚", "你是把梦想化为现实的创造者", "魔术师"), "在人格的迷宫里，你如同魔术师，\n用那双创造的手，将想象变为可能。\n你既实际又梦幻，\n如同黎明时分的第一缕阳光，\n温暖而充满希望。\n", new qsc("Personality", t72.I(new rsc("灵感天赋型选手", "你拥有令人眩目的创造力，仿佛你的思维中流淌着星光与灵感的混合物。你的想法如热带雨林般丰富多变，每一个念头都能在瞬间生长为绚丽的可能性。你能在普通的材料中看到非凡的潜力，将它们转化为令人惊叹的成果。"), new rsc("社交悍匪", "你开朗外向的社交能力让你成为任何聚会的中心，你的话语有魔法般的力量，能让最沉闷的场合也绽放光彩。"), new rsc("特立独行", "然而，你也常常承受着不被理解的孤独。你的多变如同热带海岸线上变幻莫测的天气，令人难以捉摸。理想主义的执念让你常常活在自己构建的幻想世界里，即使身处人群中也能感到一种与众不同的疏离。你的注意力如飘忽的风，来去无踪，使你难以长久专注于一件事情，特别是当它变得例行公事。"))), new qsc("Romance", t72.H(new rsc("来去自如", "你的爱情像清晨的薄雾，轻盈却包容万物。在感情中，你既热情似火又飘忽不定，能在一瞬间点燃对方的灵魂，却也可能在下一刻被另一个可能性吸引。你的情感如同热带的雨季，来得汹涌，去得悄无声息，留下一片既肥沃又复杂的回忆之地。"))), new zw2("与你最相配的是", "星星", "牌", new iy9(new TarotCardChoice(TarotCardType.THE_STAR, true, (String) null, 4, (rp3) null), new TarotCardChoice(tarotCardType, true, (String) null, 4, (rp3) null)), "星星的梦想性和温柔将为你提供安静的港湾，让你那狂野的创造力有所依靠。这种结合融合了想象与温柔，虽历经风雨，却依然能在彼此身上找到生命的意义。你们的关系如同海与天的交界，相互映照，共同完整。"), new qsc("Profession", t72.H(new rsc("发挥创造力", "你适合那些能让创造力无限发挥的职业：艺术家、发明家、演说家、企业家、营销人员。在这些领域，你能向世人展示前所未见的奇迹与可能。你的工作不会是简单的谋生手段，而是灵魂的延伸，是你与这个世界对话的方式。"))), new x92("Cosmic", t72.H(new y92("愿你如", "魔术师", "般创造自己的宇宙", "在每一个清晨的阳光里发现新的可能性。愿你的灵魂永远充满那种不可思议的魔力，让平凡的日子闪耀着神奇的光芒。记住，无论多么孤独的旅程，都有属于你的指引之光，在记忆的河流中为你照亮前方。", "你注定要成为自己的传奇，在众多可能性中找到真正属于你的那一条路径。"))));
    }

    public static final void a(dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(1069729728);
        if (l46Var.W(i & 1, (i & 3) != 2)) {
            j09 j09VarD0 = ynb.d0(0.0f, 24.0f, 0.0f, 12.0f, 5, ynb.b0(36.0f, 0.0f, b.c(g09.a, 1.0f), 2));
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD0);
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
            tec.q(6, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qx1(dd2Var, i, 18);
        }
    }

    public static final void b(j09 j09Var, TarotCardChoice tarotCardChoice, TarotCardChoice tarotCardChoice2, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        tarotCardChoice.getClass();
        tarotCardChoice2.getClass();
        l46Var2.h0(1758501927);
        int i2 = i | (l46Var2.g(tarotCardChoice) ? 32 : 16) | (l46Var2.g(tarotCardChoice2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            lx0 lx0Var = ndb.b;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            lx0 lx0Var2 = ndb.d;
            d31 d31Var = d31.a;
            g09 g09Var = g09.a;
            o7c.d(q6c.i(tm7.N(0.0f, 40.0f, b.p(d31Var.a(g09Var, lx0Var2), 145.0f), 1), 24.0f), q7c.r(tarotCardChoice2), null, true, null, 0.0f, null, false, l46Var2, 3072, 244);
            o7c.d(q6c.i(tm7.N(0.0f, 40.0f, b.p(d31Var.a(g09Var, lx0Var), 145.0f), 1), -8.0f), q7c.r(tarotCardChoice), null, true, null, 0.0f, null, false, l46Var, 3072, 244);
            feg.j(od4.A(R.drawable.cp_connector, 0, l46Var), null, tm7.M(d31Var.a(q6c.i(b.m(g09Var, 47.0f, 27.0f), -4.5f), ndb.c), 15.0f, 5.0f), null, null, 0.0f, null, l46Var, 56, 120);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new hca(j09Var, tarotCardChoice, tarotCardChoice2, i, 1);
        }
    }

    public static final void c(String str, String str2, String str3, l46 l46Var, int i) {
        l46Var.h0(-530160199);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16) | (l46Var.g(str3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (!l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            l46Var.Z();
        } else if (str == null && str2 == null && str3 == null) {
            l46Var.f0(-1407056535);
            l46Var.r(false);
        } else {
            l46Var.f0(1617163410);
            l46Var.f0(1617163777);
            i00 i00Var = new i00();
            if (str != null) {
                i00Var.f(str);
            }
            if (str2 == null) {
                l46Var.f0(1034637347);
                l46Var.r(false);
            } else {
                l46Var.f0(1034637348);
                int iK = i00Var.k(new xtd(((m82) l46Var.k(o82.a)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    i00Var.f(str2);
                    i00Var.h(iK);
                    l46Var.r(false);
                } catch (Throwable th) {
                    i00Var.h(iK);
                    throw th;
                }
            }
            if (str3 != null) {
                i00Var.f(str3);
            }
            k00 k00VarL = i00Var.l();
            l46Var.r(false);
            mue mueVar = pue.a;
            nte.c(k00VarL, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mue.a(pue.n(l46Var), 0L, 0L, ar5.d, ((y8b) l46Var.k(x8b.a)).a, 0L, null, 3, w6c.k(40.5d), null, null, 16613339), l46Var, 0, 0, 262142);
            l46Var.r(false);
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, str, str2, str3, 3);
        }
    }

    public static final void d(j09 j09Var, bx9 bx9Var, dsb dsbVar, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        j09 j09Var3;
        dsbVar.getClass();
        l46Var.h0(-1204735542);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(bx9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? l46Var.g(dsbVar) : l46Var.i(dsbVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i5 = i3;
        if (l46Var.W(i5 & 1, (i5 & 147) != 146)) {
            g09 g09Var = g09.a;
            j09Var3 = i4 != 0 ? g09Var : j09Var2;
            j09 j09VarO = tm7.o(j09Var3, ((e8b) l46Var.k(l8b.a)).a, a7c.d(0.0f, 0.0f, 24.0f, 3));
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarO);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            feg.j(od4.A(R.drawable.bg_personality, 0, l46Var), null, pa7.p(b.d(b.c(g09Var, 1.0f), 1000.0f), 0.5f), null, an2.g, 0.0f, null, l46Var, 25016, 104);
            e(ynb.Y(g09Var, bx9Var), dsbVar, l46Var, (i5 >> 3) & 112);
            l46Var.r(true);
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(j09Var3, bx9Var, dsbVar, i, i2, 9);
        }
    }

    public static final void e(j09 j09Var, dsb dsbVar, l46 l46Var, int i) {
        int i2;
        dsbVar.getClass();
        l46Var.h0(-190266699);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var.g(dsbVar) : l46Var.i(dsbVar) ? 32 : 16;
        }
        int i3 = 7;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
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
            t6d.a(dsbVar, null, l46Var, (i2 & 112) | 6, 2);
            g09 g09Var = g09.a;
            o5c.f(l46Var, b.d(g09Var, 32.0f));
            n16.d(null, false, false, dsbVar.d.a, null, af1.b0(289883635, new isb(dsbVar, 5), l46Var), l46Var, 196656, 21);
            String str = dsbVar.e.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            dd2 dd2VarB0 = af1.b0(-913297308, new isb(dsbVar, 6), l46Var);
            x01 x01Var = x01.b;
            n16.f(j09VarC, false, false, str, x01Var, dd2VarB0, l46Var, 221238, 4);
            n16.b(b.c(g09Var, 1.0f), false, false, null, null, af1.b0(1399427872, new isb(dsbVar, i3), l46Var), l46Var, 196662, 28);
            n16.e(b.c(g09Var, 1.0f), false, false, dsbVar.g.a, x01Var, af1.b0(-457174129, new isb(dsbVar, 8), l46Var), l46Var, 221238, 4);
            n16.c(b.c(g09Var, 1.0f), false, false, dsbVar.h.a, null, af1.b0(1266869875, new isb(dsbVar, 9), l46Var), l46Var, 196662, 20);
            tec.u(g09Var, 24.0f, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(j09Var, dsbVar, i, i3);
        }
    }

    public static final void f(String str, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        str.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(594550645);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new t8(str, 11);
                l46Var.p0(objR);
            }
            x16 x16Var3 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            xsb xsbVar = (xsb) z5c.G(job.a.b(xsb.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var3);
            yrb yrbVar = (yrb) xsbVar.b.getValue();
            boolean zI = (i3 == 4) | l46Var.i(xsbVar) | ((i2 & 896) == 256);
            Object objR2 = l46Var.R();
            if (zI || objR2 == obj) {
                objR2 = new jsb(xsbVar, str, x16Var2, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, yrbVar);
            g(x16Var, x16Var2, str.equals("dev-report") ? a : (dsb) tm7.t(xsbVar.c, l46Var).getValue(), l46Var, (i2 >> 3) & 126);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o7b(i, str, x16Var, x16Var2, 4);
        }
    }

    public static final void g(x16 x16Var, x16 x16Var2, dsb dsbVar, l46 l46Var, int i) {
        int i2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1208627458);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.i(x16Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? l46Var.g(dsbVar) : l46Var.i(dsbVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            ghc ghcVarT = mh3.T(l46Var);
            n69 n69VarZ = g21.Z(ghcVarT, l46Var);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            bzd.l(null, dsbVar == null, 0L, null, null, af1.b0(1455361868, new j41(dsbVar, ghcVarT, x16Var, 19), l46Var), l46Var, 1572864, 61);
            y7h.g(mh3.W(tm7.o(g09Var, y72.b(((m82) l46Var.k(o82.a)).p, ((qz9) n69VarZ).j()), g21.f)), null, m93.o(0, 14), 0L, x16Var, x16Var2, l46Var, (i2 << 12) & 516096, 10);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i, x16Var, x16Var2, dsbVar, 10);
        }
    }

    public static final void h(String str, String str2, l46 l46Var, int i) {
        String str3;
        g09 g09Var;
        char c;
        boolean z;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2095132211);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16);
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            g09 g09Var2 = g09.a;
            if (str == null) {
                l46Var2.f0(-1618884941);
                l46Var2.r(false);
                g09Var = g09Var2;
                c = 0;
                z = false;
            } else {
                l46Var2.f0(-1618884940);
                mue mueVar = pue.a;
                nte.b(str, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, ar5.d, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, w6c.k(40.5d), null, null, 16646107), l46Var, i2 & 14, 0, 131070);
                l46Var2 = l46Var;
                g09Var = g09Var2;
                c = 0;
                z = false;
                tec.u(g09Var, 12.0f, l46Var2, false);
            }
            if (str2 == null) {
                l46Var2.f0(-1618625192);
                l46Var2.r(z);
                str3 = str2;
            } else {
                l46Var2.f0(-1618625191);
                mue mueVar2 = oue.a;
                g09 g09Var3 = g09Var;
                str3 = str2;
                nte.b(str3, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var, (i2 >> 3) & 14, 0, 131070);
                l46Var2 = l46Var;
                tec.u(g09Var3, 12.0f, l46Var2, false);
            }
        } else {
            str3 = str2;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new uz5(str, i, str3, 2);
        }
    }
}
