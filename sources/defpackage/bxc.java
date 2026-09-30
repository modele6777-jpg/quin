package defpackage;

import android.view.autofill.AutofillValue;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bxc {
    public final LayoutNode a;
    public final vu4 b;
    public final u67 c;
    public final i79 d = new i79(2);

    public bxc(LayoutNode layoutNode, vu4 vu4Var, q69 q69Var) {
        this.a = layoutNode;
        this.b = vu4Var;
        this.c = q69Var;
    }

    public final ywc a() {
        return new ywc(this.b, false, this.a, new twc());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x007a  */
    /* JADX WARN: Code duplicated, block: B:42:0x008f  */
    public final void b(LayoutNode layoutNode, twc twcVar) {
        ar arVar;
        ar arVar2;
        String str;
        String str2;
        yye yyeVar;
        yye yyeVar2;
        yr yrVar;
        yr yrVar2;
        i79 i79Var = this.d;
        Object[] objArr = i79Var.a;
        int i = i79Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            zo zoVar = (zo) objArr[i2];
            zoVar.getClass();
            twc twcVarH = layoutNode.H();
            int i3 = layoutNode.b;
            vea veaVar = zoVar.a;
            AndroidComposeView androidComposeView = zoVar.c;
            if (twcVar != null) {
                Object objG = twcVar.a.g(cxc.s);
                if (objG == null) {
                    objG = null;
                }
                arVar = (ar) objG;
            } else {
                arVar = null;
            }
            if (twcVarH != null) {
                Object objG2 = twcVarH.a.g(cxc.s);
                if (objG2 == null) {
                    objG2 = null;
                }
                arVar2 = (ar) objG2;
            } else {
                arVar2 = null;
            }
            ar arVar3 = ndb.K0;
            if (!pa7.t(arVar2, arVar3)) {
                if (pa7.t(arVar, arVar3) && !pa7.t(arVar2, arVar3)) {
                    veaVar.z(androidComposeView, i3, true);
                }
                if (twcVar != null) {
                    Object objG3 = twcVar.a.g(cxc.F);
                    if (objG3 == null) {
                        objG3 = null;
                    }
                    k00 k00Var = (k00) objG3;
                    if (k00Var != null) {
                        str = k00Var.b;
                    } else {
                        str = null;
                    }
                } else {
                    str = null;
                }
                if (twcVarH != null) {
                    Object objG4 = twcVarH.a.g(cxc.F);
                    if (objG4 == null) {
                        objG4 = null;
                    }
                    k00 k00Var2 = (k00) objG4;
                    if (k00Var2 != null) {
                        str2 = k00Var2.b;
                    } else {
                        str2 = null;
                    }
                } else {
                    str2 = null;
                }
                if (str != str2) {
                    if (str == null) {
                        veaVar.z(androidComposeView, i3, true);
                    } else if (str2 == null) {
                        veaVar.z(androidComposeView, i3, false);
                    } else if (pa7.t(arVar2, ndb.L0)) {
                        veaVar.w().notifyValueChanged(androidComposeView, i3, AutofillValue.forText(lmg.r0(str2)));
                    }
                }
                if (twcVar != null) {
                    Object objG5 = twcVar.a.g(cxc.L);
                    if (objG5 == null) {
                        objG5 = null;
                    }
                    yyeVar = (yye) objG5;
                } else {
                    yyeVar = null;
                }
                if (twcVarH != null) {
                    Object objG6 = twcVarH.a.g(cxc.L);
                    if (objG6 == null) {
                        objG6 = null;
                    }
                    yyeVar2 = (yye) objG6;
                } else {
                    yyeVar2 = null;
                }
                if (yyeVar != yyeVar2) {
                    if (yyeVar == null) {
                        veaVar.z(androidComposeView, i3, true);
                    } else if (yyeVar2 == null) {
                        veaVar.z(androidComposeView, i3, false);
                    } else if (pa7.t(arVar2, ndb.M0)) {
                        int iOrdinal = yyeVar2.ordinal();
                        Boolean bool = iOrdinal != 0 ? iOrdinal != 1 ? null : Boolean.FALSE : Boolean.TRUE;
                        if (bool != null) {
                            veaVar.w().notifyValueChanged(androidComposeView, i3, AutofillValue.forToggle(bool.booleanValue()));
                        }
                    }
                }
                if (twcVar != null) {
                    Object objG7 = twcVar.a.g(cxc.t);
                    if (objG7 == null) {
                        objG7 = null;
                    }
                    yrVar = (yr) objG7;
                } else {
                    yrVar = null;
                }
                if (twcVarH != null) {
                    Object objG8 = twcVarH.a.g(cxc.t);
                    if (objG8 == null) {
                        objG8 = null;
                    }
                    yrVar2 = (yr) objG8;
                } else {
                    yrVar2 = null;
                }
                if (!pa7.t(yrVar, yrVar2)) {
                    if (yrVar == null) {
                        veaVar.z(androidComposeView, i3, true);
                    } else if (yrVar2 == null) {
                        veaVar.z(androidComposeView, i3, false);
                    } else {
                        veaVar.w().notifyValueChanged(androidComposeView, i3, yrVar2.a);
                    }
                }
            } else if (!pa7.t(arVar, arVar3)) {
                veaVar.z(androidComposeView, i3, false);
            }
            boolean z = twcVar != null && twcVar.a.b(cxc.r);
            boolean z2 = twcVarH != null && twcVarH.a.b(cxc.r);
            if (z != z2) {
                r69 r69Var = zoVar.v;
                if (z2) {
                    r69Var.a(i3);
                } else {
                    r69Var.f(i3);
                }
            }
        }
    }
}
