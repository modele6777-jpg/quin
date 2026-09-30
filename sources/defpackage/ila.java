package defpackage;

import ai.askquin.R;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ila extends k1 {
    public static final zea V0 = new zea(2);
    public final View E0;
    public final boolean F0;
    public final eu4 G0;
    public final WindowManager H0;
    public final WindowManager.LayoutParams I0;
    public lla J0;
    public cv7 K0;
    public final vz9 L0;
    public final vz9 M0;
    public a77 N0;
    public final mx3 O0;
    public final Rect P0;
    public final nsd Q0;
    public r60 R0;
    public final vz9 S0;
    public boolean T0;
    public final int[] U0;
    public x16 x;
    public nma y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ila(x16 x16Var, nma nmaVar, String str, View view, sw3 sw3Var, lla llaVar, UUID uuid, boolean z) {
        super(view.getContext());
        int i = Build.VERSION.SDK_INT;
        int i2 = 19;
        eu4 klaVar = i >= 30 ? new kla(i2) : i >= 29 ? new jla(i2) : new eu4(i2);
        this.x = x16Var;
        this.y = nmaVar;
        this.z = str;
        this.E0 = view;
        this.F0 = z;
        this.G0 = klaVar;
        Object systemService = view.getContext().getSystemService("window");
        systemService.getClass();
        this.H0 = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        nma nmaVar2 = this.y;
        boolean zB = pu.b(view);
        boolean z2 = nmaVar2.b;
        int i3 = nmaVar2.a;
        if (z2 && zB) {
            i3 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else if (z2 && !zB) {
            i3 &= -8193;
        }
        layoutParams.flags = i3;
        layoutParams.type = this.y.f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.I0 = layoutParams;
        this.J0 = llaVar;
        this.K0 = cv7.a;
        this.L0 = q1c.f(null);
        this.M0 = q1c.f(null);
        this.O0 = zrd.b(new hla(0, this));
        this.P0 = new Rect();
        this.Q0 = new nsd(new lu(this, 2));
        setId(android.R.id.content);
        setTag(R.id.view_tree_lifecycle_owner, scc.j(view));
        setTag(R.id.view_tree_view_model_store_owner, gdc.d(view));
        setTag(R.id.view_tree_saved_state_registry_owner, fdc.i(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(sw3Var.p0(8.0f));
        setOutlineProvider(new t84(2));
        this.S0 = q1c.f(lmg.a);
        this.U0 = new int[2];
    }

    private final l26 getContent() {
        return (l26) this.S0.getValue();
    }

    private final a77 getDisplayBounds() {
        int i = this.y.a & 512;
        View view = this.E0;
        Rect rect = this.P0;
        eu4 eu4Var = this.G0;
        if (i == 0) {
            eu4Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            eu4Var.g(view, rect);
        }
        return new a77(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final bv7 getParentLayoutCoordinates() {
        return (bv7) this.M0.getValue();
    }

    public static final boolean m(ila ilaVar) {
        bv7 parentLayoutCoordinates = ilaVar.getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null || !parentLayoutCoordinates.h()) {
            parentLayoutCoordinates = null;
        }
        return (parentLayoutCoordinates == null || ilaVar.m17getPopupContentSizebOM6tXw() == null) ? false : true;
    }

    private final void setContent(l26 l26Var) {
        this.S0.setValue(l26Var);
    }

    private final void setParentLayoutCoordinates(bv7 bv7Var) {
        this.M0.setValue(bv7Var);
    }

    @Override // defpackage.k1
    public final void a(int i, l46 l46Var) {
        l46Var.h0(-857613600);
        int i2 = (l46Var.i(this) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            getContent().z(l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wf8(this, i, 9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.y.c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                x16 x16Var = this.x;
                if (x16Var != null) {
                    x16Var.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // defpackage.k1
    public final void g(boolean z, int i, int i2, int i3, int i4) {
        super.g(z, i, i2, i3, i4);
        this.y.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.I0;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.G0.getClass();
        this.H0.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.O0.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.I0;
    }

    public final cv7 getParentLayoutDirection() {
        return this.K0;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final e77 m17getPopupContentSizebOM6tXw() {
        return (e77) this.L0.getValue();
    }

    public final lla getPositionProvider() {
        return this.J0;
    }

    @Override // defpackage.k1
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.T0;
    }

    public final String getTestTag() {
        return this.z;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // defpackage.k1
    public final void h(int i, int i2) {
        this.y.getClass();
        a77 displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.d(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.b(), Integer.MIN_VALUE));
    }

    public final void n(lg2 lg2Var, l26 l26Var) {
        setParentCompositionContext(lg2Var);
        setContent(l26Var);
        this.T0 = true;
    }

    public final void o(x16 x16Var, nma nmaVar, String str, cv7 cv7Var) {
        int i;
        this.x = x16Var;
        this.z = str;
        if (!pa7.t(this.y, nmaVar)) {
            nmaVar.getClass();
            this.y = nmaVar;
            boolean zB = pu.b(this.E0);
            boolean z = nmaVar.b;
            int i2 = nmaVar.a;
            if (z && zB) {
                i2 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
            } else if (z && !zB) {
                i2 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.I0;
            layoutParams.flags = i2;
            this.G0.getClass();
            this.H0.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = cv7Var.ordinal();
        if (iOrdinal != 0) {
            i = 1;
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
        } else {
            i = 0;
        }
        super.setLayoutDirection(i);
    }

    @Override // defpackage.k1, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.Q0.e();
        if (!this.y.c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        r60 r60Var = this.R0;
        if (r60Var == null) {
            r60 r60Var2 = new r60(0, this.x);
            this.R0 = r60Var2;
            r60Var = r60Var2;
        }
        q6.E(this, r60Var);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nsd nsdVar = this.Q0;
        hrd hrdVar = nsdVar.h;
        if (hrdVar != null) {
            hrdVar.a();
        }
        nsdVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            q6.F(this, this.R0);
        }
        this.R0 = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.y.d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            x16 x16Var = this.x;
            if (x16Var != null) {
                x16Var.invoke();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            x16 x16Var2 = this.x;
            if (x16Var2 != null) {
                x16Var2.invoke();
            }
        }
        return true;
    }

    public final void p() {
        bv7 parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.h()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jL = parentLayoutCoordinates.l();
            long jR = this.F0 ? parentLayoutCoordinates.r(0L) : parentLayoutCoordinates.c(0L);
            a77 a77VarN = n16.n((((long) Math.round(Float.intBitsToFloat((int) (jR >> 32)))) << 32) | (4294967295L & ((long) Math.round(Float.intBitsToFloat((int) (jR & 4294967295L))))), jL);
            if (a77VarN.equals(this.N0)) {
                return;
            }
            this.N0 = a77VarN;
            r();
        }
    }

    public final void q(bv7 bv7Var) {
        setParentLayoutCoordinates(bv7Var);
        p();
    }

    public final void r() {
        e77 e77VarM17getPopupContentSizebOM6tXw;
        final a77 a77Var = this.N0;
        if (a77Var == null || (e77VarM17getPopupContentSizebOM6tXw = m17getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        final long j = e77VarM17getPopupContentSizebOM6tXw.a;
        a77 displayBounds = getDisplayBounds();
        final long jB = (((long) displayBounds.b()) & 4294967295L) | (((long) displayBounds.d()) << 32);
        final lmb lmbVar = new lmb();
        lmbVar.element = 0L;
        this.Q0.d(this, V0, new x16() { // from class: gla
            @Override // defpackage.x16
            public final Object invoke() {
                ila ilaVar = this;
                lmbVar.element = ilaVar.J0.x(a77Var, jB, ilaVar.K0, j);
                return wef.a;
            }
        });
        long j2 = lmbVar.element;
        WindowManager.LayoutParams layoutParams = this.I0;
        layoutParams.x = (int) (j2 >> 32);
        layoutParams.y = (int) (j2 & 4294967295L);
        boolean z = this.y.e;
        eu4 eu4Var = this.G0;
        if (z) {
            eu4Var.k(this, (int) (jB >> 32), (int) (jB & 4294967295L));
        }
        eu4Var.getClass();
        this.H0.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(cv7 cv7Var) {
        this.K0 = cv7Var;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m18setPopupContentSizefhxjrPA(e77 e77Var) {
        this.L0.setValue(e77Var);
    }

    public final void setPositionProvider(lla llaVar) {
        this.J0 = llaVar;
    }

    public final void setTestTag(String str) {
        this.z = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public k1 getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
    }
}
