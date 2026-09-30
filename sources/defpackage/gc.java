package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.draw.photo.homepage.CardPositionConfig;
import ai.askquin.ui.router.GiftCardPerspective;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.List;
import tech.chatmind.api.TarotCardInfo;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class gc implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ gc(int i, d83 d83Var, x16 x16Var, int i2) {
        this.a = 14;
        this.b = i;
        this.c = d83Var;
        this.d = x16Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        boolean z;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        int i2 = this.b;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                lc.n((lb) obj4, (fb) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                m00.a((k00) obj4, (List) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                kn2.r((j09) obj4, (xw9) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                hkg.F((en0) obj4, (String) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((f01) obj4).a((c4c) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                h01.a((c4c) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                uq1.o((bod) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                uq1.e((TarotCardInfo) obj4, (j09) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 8:
                final CardPositionConfig cardPositionConfig = (CardPositionConfig) obj4;
                final a26 a26Var = (a26) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j09 j09VarZ = ynb.Z(g09Var, 16.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    String strF = tec.f(i2 + 1, "Card ", " Configuration");
                    pr4 pr4Var = r9f.a;
                    nte.b(strF, null, ((m82) l46Var.k(o82.a)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).i, l46Var, 0, 0, 131066);
                    o5c.f(l46Var, b.d(g09Var, 12.0f));
                    nte.b("Position (dp)", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).n, l46Var, 6, 0, 131070);
                    j09 j09VarE = kv2.e(g09Var, 4.0f, l46Var, g09Var, 1.0f);
                    uc0 uc0Var = new uc0(16.0f, true, new qc0(0));
                    kx0 kx0Var = ndb.y;
                    t7c t7cVarA = s7c.a(uc0Var, kx0Var, l46Var, 6);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarE);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    float x = cardPositionConfig.getX();
                    boolean zG = l46Var.g(a26Var) | l46Var.i(cardPositionConfig);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zG || objR == i8cVar) {
                        final int i3 = 0;
                        objR = new a26() { // from class: qr1
                            @Override // defpackage.a26
                            public final Object d(Object obj5) {
                                int i4 = i3;
                                wef wefVar2 = wef.a;
                                a26 a26Var2 = a26Var;
                                switch (i4) {
                                    case 0:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                                        break;
                                    case 1:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, null, 61, null));
                                        break;
                                    case 2:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, null, 59, null));
                                        break;
                                    case 3:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, null, 55, null));
                                        break;
                                    case 4:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), null, 47, null));
                                        break;
                                    default:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) obj5, 31, null));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR);
                    }
                    v7c v7cVar = v7c.a;
                    gs1.f("X", x, (a26) objR, v7cVar.a(g09Var, 1.0f, true), l46Var, 6);
                    float y = cardPositionConfig.getY();
                    boolean zG2 = l46Var.g(a26Var) | l46Var.i(cardPositionConfig);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        z = true;
                        final boolean z2 = true ? 1 : 0;
                        objR2 = new a26() { // from class: qr1
                            @Override // defpackage.a26
                            public final Object d(Object obj5) {
                                int i4 = z2;
                                wef wefVar2 = wef.a;
                                a26 a26Var2 = a26Var;
                                switch (i4) {
                                    case 0:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                                        break;
                                    case 1:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, null, 61, null));
                                        break;
                                    case 2:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, null, 59, null));
                                        break;
                                    case 3:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, null, 55, null));
                                        break;
                                    case 4:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), null, 47, null));
                                        break;
                                    default:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) obj5, 31, null));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR2);
                    } else {
                        z = true;
                    }
                    gs1.f("Y", y, (a26) objR2, v7cVar.a(g09Var, 1.0f, z), l46Var, 6);
                    ib8.t(l46Var, z, g09Var, 12.0f, l46Var);
                    nte.b("Size (dp)", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).n, l46Var, 6, 0, 131070);
                    j09 j09VarE2 = kv2.e(g09Var, 4.0f, l46Var, g09Var, 1.0f);
                    t7c t7cVarA2 = s7c.a(new uc0(16.0f, true, new qc0(0)), kx0Var, l46Var, 6);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    j09 j09VarJ3 = m93.J(l46Var, j09VarE2);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA2);
                    dec.l(he2Var2, l46Var, u8aVarM3);
                    ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ3);
                    float width = cardPositionConfig.getWidth();
                    boolean zG3 = l46Var.g(a26Var) | l46Var.i(cardPositionConfig);
                    Object objR3 = l46Var.R();
                    if (zG3 || objR3 == i8cVar) {
                        final int i4 = 2;
                        objR3 = new a26() { // from class: qr1
                            @Override // defpackage.a26
                            public final Object d(Object obj5) {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                a26 a26Var2 = a26Var;
                                switch (i5) {
                                    case 0:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                                        break;
                                    case 1:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, null, 61, null));
                                        break;
                                    case 2:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, null, 59, null));
                                        break;
                                    case 3:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, null, 55, null));
                                        break;
                                    case 4:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), null, 47, null));
                                        break;
                                    default:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) obj5, 31, null));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR3);
                    }
                    gs1.f("Width", width, (a26) objR3, v7cVar.a(g09Var, 1.0f, true), l46Var, 6);
                    float height = cardPositionConfig.getHeight();
                    boolean zG4 = l46Var.g(a26Var) | l46Var.i(cardPositionConfig);
                    Object objR4 = l46Var.R();
                    if (zG4 || objR4 == i8cVar) {
                        final int i5 = 3;
                        objR4 = new a26() { // from class: qr1
                            @Override // defpackage.a26
                            public final Object d(Object obj5) {
                                int i6 = i5;
                                wef wefVar2 = wef.a;
                                a26 a26Var2 = a26Var;
                                switch (i6) {
                                    case 0:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                                        break;
                                    case 1:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, null, 61, null));
                                        break;
                                    case 2:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, null, 59, null));
                                        break;
                                    case 3:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, null, 55, null));
                                        break;
                                    case 4:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), null, 47, null));
                                        break;
                                    default:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) obj5, 31, null));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR4);
                    }
                    gs1.f("Height", height, (a26) objR4, v7cVar.a(g09Var, 1.0f, true), l46Var, 6);
                    ib8.t(l46Var, true, g09Var, 12.0f, l46Var);
                    nte.b("Rotation", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).n, l46Var, 6, 0, 131070);
                    float rotation = cardPositionConfig.getRotation();
                    boolean zG5 = l46Var.g(a26Var) | l46Var.i(cardPositionConfig);
                    Object objR5 = l46Var.R();
                    if (zG5 || objR5 == i8cVar) {
                        final int i6 = 4;
                        objR5 = new a26() { // from class: qr1
                            @Override // defpackage.a26
                            public final Object d(Object obj5) {
                                int i7 = i6;
                                wef wefVar2 = wef.a;
                                a26 a26Var2 = a26Var;
                                switch (i7) {
                                    case 0:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                                        break;
                                    case 1:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, null, 61, null));
                                        break;
                                    case 2:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, null, 59, null));
                                        break;
                                    case 3:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, null, 55, null));
                                        break;
                                    case 4:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), null, 47, null));
                                        break;
                                    default:
                                        a26Var2.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) obj5, 31, null));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR5);
                    }
                    a26 a26Var2 = (a26) objR5;
                    b62 b62Var = new b62(-180.0f, 180.0f);
                    Object objR6 = l46Var.R();
                    if (objR6 == i8cVar) {
                        objR6 = new wu0(19);
                        l46Var.p0(objR6);
                    }
                    gs1.j(rotation, a26Var2, b62Var, (a26) objR6, l46Var, 24582);
                    o5c.f(l46Var, b.d(g09Var, 12.0f));
                    nte.b("Z-Index (optional)", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).n, l46Var, 6, 0, 131070);
                    o5c.f(l46Var, b.d(g09Var, 4.0f));
                    Integer zIndex = cardPositionConfig.getZIndex();
                    boolean zG6 = l46Var.g(a26Var) | l46Var.i(cardPositionConfig);
                    Object objR7 = l46Var.R();
                    if (zG6 || objR7 == i8cVar) {
                        final int i7 = 5;
                        objR7 = new a26() { // from class: qr1
                            @Override // defpackage.a26
                            public final Object d(Object obj5) {
                                int i8 = i7;
                                wef wefVar2 = wef.a;
                                a26 a26Var3 = a26Var;
                                switch (i8) {
                                    case 0:
                                        a26Var3.d(CardPositionConfig.copy$default(cardPositionConfig, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, null, 62, null));
                                        break;
                                    case 1:
                                        a26Var3.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, 0.0f, null, 61, null));
                                        break;
                                    case 2:
                                        a26Var3.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, 0.0f, null, 59, null));
                                        break;
                                    case 3:
                                        a26Var3.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), 0.0f, null, 55, null));
                                        break;
                                    case 4:
                                        a26Var3.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, ((Float) obj5).floatValue(), null, 47, null));
                                        break;
                                    default:
                                        a26Var3.d(CardPositionConfig.copy$default(cardPositionConfig, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, (Integer) obj5, 31, null));
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR7);
                    }
                    gs1.i(zIndex, (a26) objR7, l46Var, 0);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                kn2.i((Integer) obj4, (String) obj3, (l46) obj, k99.P(1), i2);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                ((dd2) obj4).e(obj3, (l46) obj, k99.P(i2) | 1);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).intValue();
                mh3.a((e1b) obj4, (l26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                mh3.b((e1b[]) obj4, (l26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                List list = (List) obj4;
                y72 y72Var = (y72) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else if (list.isEmpty()) {
                    l46Var2.f0(1383047780);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1382820023);
                    xj3.p(list.size(), this.b, y72Var, androidx.compose.ui.platform.b.a(g09Var, "daily_card_skin_picker_indicator"), l46Var2, 3072);
                    l46Var2.r(false);
                }
                break;
            case 14:
                ((Integer) obj2).getClass();
                z83.c(i2, (d83) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 15:
                ((Integer) obj2).getClass();
                vf3.l((ke3) obj4, (j91) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                bm8.d((j09) obj4, (nh4) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 17:
                ((Integer) obj2).getClass();
                bp4.b((r0) obj4, (eda) obj3, i2, (l46) obj, k99.P(73));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ga5.g((j09) obj4, (QuotaBlockReason) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 19:
                bx9 bx9Var = (bx9) obj4;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    for (int i8 = 0; i8 < i2; i8++) {
                        j09 j09VarY = ynb.Y(g09Var, bx9Var);
                        xn8 xn8VarC = s21.c(ndb.b, false);
                        int iHashCode4 = Long.hashCode(l46Var3.T);
                        u8a u8aVarM4 = l46Var3.m();
                        j09 j09VarJ4 = m93.J(l46Var3, j09VarY);
                        lf2.q.getClass();
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(ov7Var);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(hj6.z, l46Var3, xn8VarC);
                        dec.l(hj6.y, l46Var3, u8aVarM4);
                        dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode4));
                        dec.k(l46Var3);
                        dec.l(hj6.x, l46Var3, j09VarJ4);
                        dd2Var.m(Integer.valueOf(i8), l46Var3, 0);
                        l46Var3.r(true);
                    }
                } else {
                    l46Var3.Z();
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                kj0.M((mic) obj4, (qs5) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                g21.o((ii6) obj4, (dd2) obj3, (l46) obj, k99.P(49), i2);
                break;
            case 22:
                ((Integer) obj2).getClass();
                bx5.a((mic) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                pa6.s((wa6) obj4, (a26) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 24:
                ((Integer) obj2).intValue();
                pa6.b((GiftCardItem) obj4, (GiftCardPerspective) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                feg.i((GiftCardItem) obj4, (x16) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                kr7.a((hr7) obj4, (dd2) obj3, (l46) obj, k99.P(i2 | 1));
                break;
            case 27:
                ((Integer) obj2).getClass();
                ((tw7) obj4).d(i2, obj3, (l46) obj, k99.P(1));
                break;
            case 28:
                rz7 rz7Var = (rz7) obj4;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    rz7Var.d(i2, obj3, l46Var4, 0);
                } else {
                    l46Var4.Z();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                ((w08) obj4).d(i2, obj3, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ gc(int i, Object obj, m26 m26Var, int i2) {
        this.a = i2;
        this.b = i;
        this.c = obj;
        this.d = m26Var;
    }

    public /* synthetic */ gc(rz7 rz7Var, int i, Object obj, int i2, int i3) {
        this.a = i3;
        this.c = rz7Var;
        this.b = i;
        this.d = obj;
    }

    public /* synthetic */ gc(r0 r0Var, eda edaVar, int i, int i2) {
        this.a = 17;
        this.c = r0Var;
        this.d = edaVar;
        this.b = i;
    }

    public /* synthetic */ gc(Object obj, int i, Object obj2, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
        this.d = obj2;
    }

    public /* synthetic */ gc(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = i;
    }

    public /* synthetic */ gc(Object obj, Object obj2, int i, int i2, int i3) {
        this.a = i3;
        this.c = obj;
        this.d = obj2;
        this.b = i2;
    }
}
