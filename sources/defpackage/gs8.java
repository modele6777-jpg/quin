package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gs8 extends hq4 {
    public final int E0;
    public final int F0;
    public ur8 G0;
    public vr8 H0;

    public gs8(Context context, boolean z) {
        super(context, z);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.E0 = 21;
            this.F0 = 22;
        } else {
            this.E0 = 22;
            this.F0 = 21;
        }
    }

    @Override // defpackage.hq4, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        nr8 nr8Var;
        int headersCount;
        int iPointToPosition;
        int i;
        if (this.G0 != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                headersCount = headerViewListAdapter.getHeadersCount();
                nr8Var = (nr8) headerViewListAdapter.getWrappedAdapter();
            } else {
                nr8Var = (nr8) adapter;
                headersCount = 0;
            }
            vr8 vr8VarB = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i = iPointToPosition - headersCount) < 0 || i >= nr8Var.getCount()) ? null : nr8Var.getItem(i);
            vr8 vr8Var = this.H0;
            if (vr8Var != vr8VarB) {
                qr8 qr8Var = nr8Var.a;
                if (vr8Var != null) {
                    this.G0.c(qr8Var, vr8Var);
                }
                this.H0 = vr8VarB;
                if (vr8VarB != null) {
                    this.G0.k(qr8Var, vr8VarB);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.E0) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.F0) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (nr8) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (nr8) adapter).a.c(false);
        return true;
    }

    public void setHoverListener(ur8 ur8Var) {
        this.G0 = ur8Var;
    }

    @Override // defpackage.hq4, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
