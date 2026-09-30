package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import defpackage.a26;
import defpackage.b59;
import defpackage.gu7;
import defpackage.hkg;
import defpackage.iy9;
import defpackage.lw7;
import defpackage.oy9;
import defpackage.ste;
import defpackage.t72;
import defpackage.ym8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends gu7 implements a26 {
    final /* synthetic */ Bitmap $bitmap;
    final /* synthetic */ Canvas $canvas;
    final /* synthetic */ List<Rect> $maskedRects;
    final /* synthetic */ Matrix $scaleMatrix;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, Bitmap bitmap, Matrix matrix, ArrayList arrayList, Canvas canvas) {
        super(1);
        this.this$0 = fVar;
        this.$bitmap = bitmap;
        this.$scaleMatrix = matrix;
        this.$maskedRects = arrayList;
        this.$canvas = canvas;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:48:0x0106 A[PHI: r4
  0x0106: PHI (r4v3 java.lang.Integer) = (r4v1 java.lang.Integer), (r4v4 java.lang.Integer) binds: [B:50:0x010d, B:47:0x0104] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x010b  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        iy9 iy9Var;
        int lineCount;
        List listH;
        int i;
        float lineRight;
        int lineTop;
        int lineBottom;
        int i2;
        io.sentry.android.replay.viewhierarchy.g gVar = (io.sentry.android.replay.viewhierarchy.g) obj;
        gVar.getClass();
        if (gVar.d && gVar.a > 0 && gVar.b > 0) {
            Rect rect = gVar.f;
            if (rect == null) {
                return Boolean.FALSE;
            }
            Integer numValueOf = null;
            int iIntValue = -16777216;
            if (gVar instanceof io.sentry.android.replay.viewhierarchy.d) {
                List listH2 = t72.H(rect);
                f fVar = this.this$0;
                Bitmap bitmap = this.$bitmap;
                Rect rect2 = gVar.f;
                Matrix matrix = this.$scaleMatrix;
                fVar.getClass();
                lw7 lw7Var = fVar.a;
                if (!bitmap.isRecycled() && !((Bitmap) lw7Var.getValue()).isRecycled()) {
                    Rect rect3 = new Rect(rect2);
                    RectF rectF = new RectF(rect3);
                    if (matrix != null) {
                        matrix.mapRect(rectF);
                    }
                    rectF.round(rect3);
                    ((Canvas) fVar.b.getValue()).drawBitmap(bitmap, rect3, new Rect(0, 0, 1, 1), (Paint) null);
                    iIntValue = ((Bitmap) lw7Var.getValue()).getPixel(0, 0);
                }
                iy9Var = new iy9(listH2, Integer.valueOf(iIntValue));
            } else if (gVar instanceof io.sentry.android.replay.viewhierarchy.f) {
                io.sentry.android.replay.viewhierarchy.f fVar2 = (io.sentry.android.replay.viewhierarchy.f) gVar;
                io.sentry.d dVar = fVar2.h;
                if (dVar != null) {
                    switch (dVar.a) {
                        case 5:
                            Layout layout = (Layout) dVar.b;
                            if (layout.getText() instanceof Spanned) {
                                CharSequence text = layout.getText();
                                text.getClass();
                                ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) ((Spanned) text).getSpans(0, layout.getText().length(), ForegroundColorSpan.class);
                                foregroundColorSpanArr.getClass();
                                int i3 = Integer.MIN_VALUE;
                                Integer numValueOf2 = null;
                                for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                                    CharSequence text2 = layout.getText();
                                    text2.getClass();
                                    int spanStart = ((Spanned) text2).getSpanStart(foregroundColorSpan);
                                    CharSequence text3 = layout.getText();
                                    text3.getClass();
                                    int spanEnd = ((Spanned) text3).getSpanEnd(foregroundColorSpan);
                                    if (spanStart != -1 && spanEnd != -1 && (i2 = spanEnd - spanStart) > i3) {
                                        numValueOf2 = Integer.valueOf(foregroundColorSpan.getForegroundColor());
                                        i3 = i2;
                                    }
                                }
                                if (numValueOf2 != null) {
                                    numValueOf = Integer.valueOf(numValueOf2.intValue() | (-16777216));
                                } else {
                                    numValueOf = null;
                                }
                            } else {
                                numValueOf = null;
                            }
                            break;
                    }
                    if (numValueOf == null) {
                        numValueOf = fVar2.i;
                        iIntValue = numValueOf != null ? numValueOf.intValue() : -16777216;
                    }
                } else {
                    numValueOf = fVar2.i;
                    if (numValueOf != null) {
                    }
                }
                Rect rect4 = gVar.f;
                int i4 = fVar2.j;
                int i5 = fVar2.k;
                rect4.getClass();
                if (dVar == null) {
                    listH = t72.H(rect4);
                } else {
                    ArrayList arrayList = new ArrayList();
                    switch (dVar.a) {
                        case 5:
                            lineCount = ((Layout) dVar.b).getLineCount();
                            break;
                        default:
                            lineCount = ((ste) dVar.b).b.f;
                            break;
                    }
                    int i6 = 0;
                    while (i6 < lineCount) {
                        float lineLeft = 0.0f;
                        switch (dVar.a) {
                            case 5:
                                Layout layout2 = (Layout) dVar.b;
                                if (layout2.getEllipsizedWidth() <= 0 || layout2.getEllipsizedWidth() >= layout2.getWidth()) {
                                    lineLeft = layout2.getLineLeft(i6);
                                }
                                break;
                            default:
                                ste steVar = (ste) dVar.b;
                                if (steVar.b.d <= ((int) (steVar.c >> 32))) {
                                    lineLeft = steVar.h(i6);
                                }
                                break;
                        }
                        int i7 = (int) lineLeft;
                        switch (dVar.a) {
                            case 5:
                                i = iIntValue;
                                Layout layout3 = (Layout) dVar.b;
                                lineRight = (layout3.getEllipsizedWidth() <= 0 || layout3.getEllipsizedWidth() >= layout3.getWidth()) ? layout3.getLineRight(i6) : layout3.getEllipsizedWidth();
                                break;
                            default:
                                ste steVar2 = (ste) dVar.b;
                                b59 b59Var = steVar2.b;
                                i = iIntValue;
                                if (b59Var.d > ((float) ((int) (steVar2.c >> 32)))) {
                                    b59Var.l(i6);
                                    ArrayList arrayList2 = b59Var.h;
                                    oy9 oy9Var = (oy9) arrayList2.get(hkg.q0(i6, arrayList2));
                                    lineRight = oy9Var.a.d.f.getLineWidth(i6 - oy9Var.d);
                                } else {
                                    lineRight = steVar2.i(i6);
                                }
                                break;
                        }
                        int i8 = (int) lineRight;
                        switch (dVar.a) {
                            case 5:
                                lineTop = ((Layout) dVar.b).getLineTop(i6);
                                break;
                            default:
                                lineTop = ym8.L(((ste) dVar.b).b.f(i6));
                                break;
                        }
                        switch (dVar.a) {
                            case 5:
                                lineBottom = ((Layout) dVar.b).getLineBottom(i6);
                                break;
                            default:
                                lineBottom = ym8.L(((ste) dVar.b).b.b(i6));
                                break;
                        }
                        Rect rect5 = new Rect();
                        rect5.left = rect4.left + i4 + i7;
                        rect5.right = rect4.left + i4 + i8;
                        int i9 = rect4.top + i5 + lineTop;
                        rect5.top = i9;
                        rect5.bottom = (lineBottom - lineTop) + i9;
                        arrayList.add(rect5);
                        i6++;
                        iIntValue = i;
                    }
                    listH = arrayList;
                }
                iy9Var = new iy9(listH, Integer.valueOf(iIntValue));
            } else {
                iy9Var = new iy9(t72.H(rect), -16777216);
            }
            List list = (List) iy9Var.a();
            ((Paint) this.this$0.c.getValue()).setColor(((Number) iy9Var.b()).intValue());
            Canvas canvas = this.$canvas;
            f fVar3 = this.this$0;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, (Paint) fVar3.c.getValue());
            }
            this.$maskedRects.addAll(list);
        }
        return Boolean.TRUE;
    }
}
