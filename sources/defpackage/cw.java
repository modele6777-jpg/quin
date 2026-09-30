package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cw extends gbe implements l26 {
    final /* synthetic */ ne2 $composeImm;
    final /* synthetic */ rx6 $imeOptions;
    final /* synthetic */ ute $layoutState;
    final /* synthetic */ a26 $onImeAction;
    final /* synthetic */ yib $receiveContentConfiguration;
    final /* synthetic */ z2f $state;
    final /* synthetic */ b89 $stylusHandwritingTrigger;
    final /* synthetic */ hga $this_platformSpecificTextInputSession;
    final /* synthetic */ x16 $updateSelectionState;
    final /* synthetic */ a26 $updateTouchMode;
    final /* synthetic */ rvf $viewConfiguration;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(b89 b89Var, z2f z2fVar, ute uteVar, ne2 ne2Var, hga hgaVar, rx6 rx6Var, yib yibVar, a26 a26Var, x16 x16Var, rvf rvfVar, a26 a26Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$stylusHandwritingTrigger = b89Var;
        this.$state = z2fVar;
        this.$layoutState = uteVar;
        this.$composeImm = ne2Var;
        this.$this_platformSpecificTextInputSession = hgaVar;
        this.$imeOptions = rx6Var;
        this.$receiveContentConfiguration = yibVar;
        this.$onImeAction = a26Var;
        this.$updateSelectionState = x16Var;
        this.$viewConfiguration = rvfVar;
        this.$updateTouchMode = a26Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        cw cwVar = new cw(this.$stylusHandwritingTrigger, this.$state, this.$layoutState, this.$composeImm, this.$this_platformSpecificTextInputSession, this.$imeOptions, this.$receiveContentConfiguration, this.$onImeAction, this.$updateSelectionState, this.$viewConfiguration, this.$updateTouchMode, xn2Var);
        cwVar.L$0 = obj;
        return cwVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            oo3.f();
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        ynb.V(aw2Var, null, dw2.d, new yv(this.$state, this.$composeImm, null), 1);
        b89 b89Var = this.$stylusHandwritingTrigger;
        if (b89Var != null) {
            ynb.V(aw2Var, null, null, new aw(b89Var, this.$composeImm, null), 3);
        }
        final c13 c13Var = new c13(this.$state, this.$layoutState, this.$composeImm, aw2Var);
        hga hgaVar = this.$this_platformSpecificTextInputSession;
        final z2f z2fVar = this.$state;
        final rx6 rx6Var = this.$imeOptions;
        final yib yibVar = this.$receiveContentConfiguration;
        final ne2 ne2Var = this.$composeImm;
        final a26 a26Var = this.$onImeAction;
        final ute uteVar = this.$layoutState;
        final x16 x16Var = this.$updateSelectionState;
        final rvf rvfVar = this.$viewConfiguration;
        final a26 a26Var2 = this.$updateTouchMode;
        bga bgaVar = new bga() { // from class: wv
            @Override // defpackage.bga
            public final InputConnection a(EditorInfo editorInfo) {
                z2f z2fVar2 = z2fVar;
                veh vehVar = new veh(z2fVar2);
                ne2 ne2Var2 = ne2Var;
                a26 a26Var3 = a26Var;
                yib yibVar2 = yibVar;
                bw bwVar = new bw(vehVar, z2fVar2, ne2Var2, a26Var3, yibVar2, c13Var, uteVar, x16Var, rvfVar, a26Var2);
                kn2.d0(editorInfo, z2fVar2.d(), z2fVar2.d().d, rx6Var, yibVar2 != null ? af1.a : null);
                return new j1e(bwVar, editorInfo);
            }
        };
        this.label = 1;
        ((iu) hgaVar).a(bgaVar, this);
        return bw2.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((cw) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
