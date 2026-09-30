package defpackage;

import ai.askquin.ui.conversation.r0;
import androidx.compose.ui.node.LayoutNode;
import com.adjust.sdk.network.ErrorCodes;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.List;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sk3 extends h36 implements x16 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk3(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0289 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:135:0x028b A[LOOP:6: B:125:0x025d->B:135:0x028b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:179:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x028e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x01d4 A[LOOP:2: B:77:0x019b->B:87:0x01d4, LOOP_END] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [int] */
    /* JADX WARN: Type inference failed for: r16v2, types: [int] */
    @Override // defpackage.x16
    public final Object invoke() {
        wo0 wo0Var;
        bv7 bv7Var;
        bv7 bv7Var2;
        Object value;
        qi9 qi9Var;
        Object value2;
        qi9 qi9Var2;
        int i = this.a;
        boolean z = false;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                ((ol3) this.receiver).f();
                return wefVar;
            case 1:
                ol3 ol3Var = (ol3) this.receiver;
                if (((sw8) ol3Var.E0.a.getValue()).a != gmd.c) {
                    ol3Var.F0 = null;
                    ol3Var.x.m(null);
                    s0e s0eVar = ol3Var.Y;
                    Boolean bool = Boolean.FALSE;
                    s0eVar.getClass();
                    s0eVar.n(null, bool);
                    ol3Var.G0 = true;
                    ynb.V(hwf.a(ol3Var), null, null, new ml3(ol3Var, null), 3);
                }
                return wefVar;
            case 2:
                return ((ume) this.receiver).a0();
            case 3:
                r0 r0Var = (r0) this.receiver;
                r0Var.R0.clear();
                r0Var.i1();
                r0Var.K1(hd4.a);
                r0Var.q();
                return wefVar;
            case 4:
                ((r0) this.receiver).m1();
                return wefVar;
            case 5:
                ((r0) this.receiver).N1();
                return wefVar;
            case 6:
                return ((rcf) this.receiver).o();
            case 7:
                return ((rcf) this.receiver).o();
            case 8:
                r0 r0Var2 = (r0) this.receiver;
                suc sucVarX = r0Var2.X();
                quc qucVar = sucVarX instanceof quc ? (quc) sucVarX : null;
                if (qucVar != null) {
                    SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) s72.y0(qucVar.a, r0Var2.A());
                    if (spreadRecommendationResult != null) {
                        r0Var2.t0(spreadRecommendationResult, true);
                    }
                }
                return wefVar;
            case 9:
                ((r0) this.receiver).m1();
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                vn5 vn5Var = (vn5) this.receiver;
                x79 x79Var = vn5Var.c;
                x79 x79Var2 = vn5Var.d;
                bo5 bo5Var = vn5Var.a;
                oo5 oo5VarG = bo5Var.g();
                ko5 ko5Var = ko5.c;
                if (oo5VarG == null) {
                    Object[] objArr = x79Var2.b;
                    long[] jArr = x79Var2.a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i2 = 0;
                        while (true) {
                            long j = jArr[i2];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i3 = 8 - ((~(i2 - length)) >>> 31);
                                for (?? r15 = z; r15 < i3; r15++) {
                                    if ((j & 255) < 128) {
                                        ((nn5) objArr[(i2 << 3) + r15]).r0(ko5Var);
                                    }
                                    j >>= 8;
                                }
                                if (i3 == 8) {
                                    if (i2 != length) {
                                        i2++;
                                        z = false;
                                    }
                                }
                            } else if (i2 != length) {
                                i2++;
                                z = false;
                            }
                        }
                    }
                } else if (oo5VarG.Y) {
                    if (x79Var.a(oo5VarG)) {
                        oo5VarG.r1();
                    }
                    ko5 ko5VarQ1 = oo5VarG.q1();
                    if (!oo5VarG.a.Y) {
                        i37.c("visitAncestors called on an unattached node");
                    }
                    i09 i09Var = oo5VarG.a;
                    LayoutNode layoutNodeS0 = vd0.s0(oo5VarG);
                    int i4 = 0;
                    while (layoutNodeS0 != null) {
                        if ((((i09) layoutNodeS0.V0.g).d & 5120) != 0) {
                            while (i09Var != null) {
                                int i5 = i09Var.c;
                                if ((i5 & 5120) != 0) {
                                    if ((i5 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
                                        i4++;
                                    }
                                    if ((i09Var instanceof nn5) && x79Var2.a(i09Var)) {
                                        if (i4 <= 1) {
                                            ((nn5) i09Var).r0(ko5VarQ1);
                                        } else {
                                            ((nn5) i09Var).r0(ko5.b);
                                        }
                                        x79Var2.m(i09Var);
                                    }
                                }
                                i09Var = i09Var.e;
                            }
                        }
                        layoutNodeS0 = layoutNodeS0.F();
                        i09Var = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
                    }
                    Object[] objArr2 = x79Var2.b;
                    long[] jArr2 = x79Var2.a;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i6 = 0;
                        while (true) {
                            long j2 = jArr2[i6];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i7 = 8 - ((~(i6 - length2)) >>> 31);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    if ((j2 & 255) < 128) {
                                        ((nn5) objArr2[(i6 << 3) + i8]).r0(ko5Var);
                                    }
                                    j2 >>= 8;
                                }
                                if (i7 == 8) {
                                    if (i6 != length2) {
                                        i6++;
                                    }
                                }
                            } else if (i6 != length2) {
                                i6++;
                            }
                        }
                    }
                }
                if (bo5Var.g() == null || bo5Var.c.q1() == ko5Var) {
                    bo5Var.d();
                }
                x79Var.f();
                x79Var2.f();
                vn5Var.e = false;
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return Boolean.valueOf(oo5.t1(((vo5) this.receiver).K0));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                vu5 vu5Var = (vu5) this.receiver;
                vu5Var.getClass();
                vu5Var.f(new z3(vu5Var, null));
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((u16) this.receiver).f(true);
                return wefVar;
            case 14:
                ((u16) this.receiver).f(true);
                return wefVar;
            case 15:
                u16 u16Var = (u16) this.receiver;
                if (!(u16Var.c.getValue() instanceof r16)) {
                    u16Var.f(false);
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                u16 u16Var2 = (u16) this.receiver;
                u16Var2.f++;
                lyd lydVar = u16Var2.e;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                u16Var2.e = null;
                return wefVar;
            case 17:
                ((b86) this.receiver).f();
                return wefVar;
            case 18:
                ((s86) this.receiver).f();
                return wefVar;
            case 19:
                ((j96) this.receiver).Q();
                return wefVar;
            case 20:
                ((xh6) this.receiver).t1();
                return wefVar;
            case 21:
                g87 g87Var = (g87) this.receiver;
                g87Var.getClass();
                g87Var.f(new z3(g87Var, null));
                return wefVar;
            case 22:
                hu8 hu8Var = (hu8) this.receiver;
                if (((Boolean) hu8Var.c.getValue()).booleanValue() && (bv7Var = hu8Var.b) != null && bv7Var.h()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 23:
                hu8 hu8Var2 = (hu8) this.receiver;
                if (((Boolean) hu8Var2.c.getValue()).booleanValue() && (bv7Var2 = hu8Var2.b) != null && bv7Var2.h() && !((List) hu8Var2.a.c.getValue()).isEmpty()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                s0e s0eVar2 = ((gj9) this.receiver).e;
                do {
                    value = s0eVar2.getValue();
                    qi9Var = (qi9) value;
                } while (!s0eVar2.l(value, qi9.a(qi9Var, false, false, 0, 0, !qi9Var.e, false, 0, 0, false, false, ErrorCodes.IO_EXCEPTION)));
                return wefVar;
            case 25:
                s0e s0eVar3 = ((gj9) this.receiver).e;
                do {
                    value2 = s0eVar3.getValue();
                    qi9Var2 = (qi9) value2;
                } while (!s0eVar3.l(value2, qi9.a(qi9Var2, false, false, 0, 0, false, false, 0, 0, !qi9Var2.i, false, 767)));
                return wefVar;
            case 26:
                bo9 bo9Var = (bo9) this.receiver;
                if (((Boolean) bo9Var.w.a.getValue()).booleanValue()) {
                    bo9Var.b.d("pendingNext", Boolean.FALSE);
                    z = true;
                }
                return Boolean.valueOf(z);
            case 27:
                ((bo9) this.receiver).b.d("edited", Boolean.TRUE);
                return wefVar;
            case 28:
                ((bq9) this.receiver).a();
                return wefVar;
            default:
                ((bq9) this.receiver).a();
                return wefVar;
        }
    }
}
