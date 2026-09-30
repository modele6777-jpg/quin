package androidx.compose.ui.node;

import defpackage.bea;
import defpackage.bxc;
import defpackage.c52;
import defpackage.cv7;
import defpackage.d52;
import defpackage.e7g;
import defpackage.eh6;
import defpackage.gte;
import defpackage.gw9;
import defpackage.ie6;
import defpackage.jkb;
import defpackage.kj4;
import defpackage.n47;
import defpackage.n6;
import defpackage.nia;
import defpackage.o09;
import defpackage.ozb;
import defpackage.pv2;
import defpackage.qs9;
import defpackage.que;
import defpackage.rq0;
import defpackage.rvf;
import defpackage.sd8;
import defpackage.sw3;
import defpackage.tp5;
import defpackage.vq0;
import defpackage.vsd;
import defpackage.vv7;
import defpackage.wq0;
import defpackage.xp5;
import defpackage.z7c;
import defpackage.zn5;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001:\u0001\u0002ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0003À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/Owner;", "", "androidx/compose/ui/node/LayoutNode", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public interface Owner {
    n6 getAccessibilityManager();

    rq0 getAutofill();

    vq0 getAutofillManager();

    wq0 getAutofillTree();

    c52 getClipboard();

    d52 getClipboardManager();

    pv2 getCoroutineContext();

    sw3 getDensity();

    kj4 getDragAndDropManager();

    zn5 getFocusOwner();

    xp5 getFontFamilyResolver();

    tp5 getFontLoader();

    ie6 getGraphicsContext();

    eh6 getHapticFeedBack();

    n47 getInputModeManager();

    cv7 getLayoutDirection();

    sd8 getLocaleList();

    o09 getModifierLocalManager();

    qs9 getOutOfFrameExecutor();

    bea getPlacementScope();

    nia getPointerIconService();

    jkb getRectManager();

    ozb getRetainedValuesStore();

    LayoutNode getRoot();

    bxc getSemanticsOwner();

    vv7 getSharedDrawScope();

    boolean getShowLayoutBounds();

    gw9 getSnapshotObserver();

    vsd getSoftwareKeyboardController();

    gte getTextInputService();

    que getTextToolbar();

    rvf getViewConfiguration();

    e7g getWindowInfo();

    void setShowLayoutBounds(boolean z);
}
