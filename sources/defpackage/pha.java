package defpackage;

import ai.askquin.R;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class pha implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ tha b;

    public /* synthetic */ pha(tha thaVar, int i) {
        this.a = i;
        this.b = thaVar;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:39:0x00b5 A[LOOP:3: B:37:0x00af->B:39:0x00b5, LOOP_END] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        tha thaVar = this.b;
        switch (i) {
            case 0:
                thaVar.k();
                break;
            case 1:
                View view = thaVar.k;
                ViewGroup viewGroup = thaVar.f;
                if (viewGroup != null) {
                    viewGroup.setVisibility(thaVar.B ? 0 : 4);
                }
                if (view != null) {
                    int dimensionPixelSize = thaVar.a.getResources().getDimensionPixelSize(R.dimen.exo_styled_progress_margin_bottom);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    if (marginLayoutParams != null) {
                        if (thaVar.B) {
                            dimensionPixelSize = 0;
                        }
                        marginLayoutParams.bottomMargin = dimensionPixelSize;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    if (view instanceof ot3) {
                        ot3 ot3Var = (ot3) view;
                        Rect rect = ot3Var.a;
                        ValueAnimator valueAnimator = ot3Var.W0;
                        if (thaVar.B) {
                            if (valueAnimator.isStarted()) {
                                valueAnimator.cancel();
                            }
                            ot3Var.Y0 = true;
                            ot3Var.X0 = 0.0f;
                            ot3Var.invalidate(rect);
                        } else {
                            int i2 = thaVar.A;
                            if (i2 == 1) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                ot3Var.Y0 = false;
                                ot3Var.X0 = 0.0f;
                                ot3Var.invalidate(rect);
                            } else if (i2 != 3) {
                                if (valueAnimator.isStarted()) {
                                    valueAnimator.cancel();
                                }
                                ot3Var.Y0 = false;
                                ot3Var.X0 = 1.0f;
                                ot3Var.invalidate(rect);
                            }
                        }
                    }
                }
                for (View view2 : thaVar.z) {
                    view2.setVisibility((thaVar.B && tha.j(view2)) ? 4 : 0);
                }
                break;
            case 2:
                ValueAnimator valueAnimator2 = thaVar.s;
                View view3 = thaVar.l;
                oha ohaVar = thaVar.a;
                ViewGroup viewGroup2 = thaVar.h;
                ViewGroup viewGroup3 = thaVar.g;
                if (viewGroup3 != null && viewGroup2 != null) {
                    int width = (ohaVar.getWidth() - ohaVar.getPaddingLeft()) - ohaVar.getPaddingRight();
                    while (viewGroup2.getChildCount() > 1) {
                        int childCount = viewGroup2.getChildCount() - 2;
                        View childAt = viewGroup2.getChildAt(childCount);
                        viewGroup2.removeViewAt(childCount);
                        viewGroup3.addView(childAt, 0);
                    }
                    if (view3 != null) {
                        view3.setVisibility(8);
                    }
                    int iC = tha.c(thaVar.j);
                    int childCount2 = viewGroup3.getChildCount() - 1;
                    for (int i3 = 0; i3 < childCount2; i3++) {
                        iC += tha.c(viewGroup3.getChildAt(i3));
                    }
                    if (iC > width) {
                        if (view3 != null) {
                            view3.setVisibility(0);
                            iC += tha.c(view3);
                        }
                        ArrayList arrayList = new ArrayList();
                        for (int i4 = 0; i4 < childCount2; i4++) {
                            View childAt2 = viewGroup3.getChildAt(i4);
                            iC -= tha.c(childAt2);
                            arrayList.add(childAt2);
                            if (iC <= width) {
                                if (!arrayList.isEmpty()) {
                                    viewGroup3.removeViews(0, arrayList.size());
                                    for (int i5 = 0; i5 < arrayList.size(); i5++) {
                                        viewGroup2.addView((View) arrayList.get(i5), viewGroup2.getChildCount() - 1);
                                    }
                                }
                            }
                            break;
                        }
                        if (!arrayList.isEmpty()) {
                            viewGroup3.removeViews(0, arrayList.size());
                            while (i5 < arrayList.size()) {
                                viewGroup2.addView((View) arrayList.get(i5), viewGroup2.getChildCount() - 1);
                            }
                        }
                        break;
                    } else {
                        ViewGroup viewGroup4 = thaVar.i;
                        if (viewGroup4 != null && viewGroup4.getVisibility() == 0 && !valueAnimator2.isStarted()) {
                            thaVar.r.cancel();
                            valueAnimator2.start();
                            break;
                        }
                    }
                }
                break;
            case 3:
                thaVar.o.start();
                break;
            case 4:
                thaVar.n.start();
                break;
            case 5:
                thaVar.m.start();
                thaVar.e(thaVar.v, 2000L);
                break;
            default:
                thaVar.i(2);
                break;
        }
    }
}
