package defpackage;

import android.R;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.TextAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j1e implements InputConnection {
    public final bw a;
    public final p89 b = new p89(0, new a26[16]);
    public final g47 c;

    public j1e(bw bwVar, EditorInfo editorInfo) {
        this.a = bwVar;
        i1e i1eVar = new i1e(this, false);
        g5b g5bVar = new g5b(8, this);
        if (editorInfo != null) {
            this.c = new g47(i1eVar, g5bVar);
        } else {
            r82.g("editorInfo must be non-null");
            throw null;
        }
    }

    public final vne a() {
        return ((z2f) this.a.c).d();
    }

    public final void b(int i) {
        sendKeyEvent(new KeyEvent(0, i));
        sendKeyEvent(new KeyEvent(1, i));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        ((veh) this.a.a).b++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.b.g();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        Objects.toString(completionInfo != null ? completionInfo.getText() : null);
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        Objects.toString(inputContentInfo);
        Objects.toString(bundle);
        return this.c.commitContent(inputContentInfo, i, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.h(new qx6(i, charSequence.toString(), (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : gq.a(textAttribute)));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        bw bwVar = this.a;
        bwVar.h(new ox6(i, i2, bwVar, 1));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        this.a.h(new nx6(i, i2, 0));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return ((veh) this.a.a).e();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        this.a.h(new tk6(18));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        return TextUtils.getCapsMode(a(), eue.g(a().d), i);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        Objects.toString(extractedTextRequest);
        vne vneVarA = a();
        ExtractedText extractedText = new ExtractedText();
        extractedText.text = vneVarA;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = vneVarA.c.length();
        extractedText.partialStartOffset = -1;
        long j = vneVarA.d;
        extractedText.selectionStart = eue.g(j);
        extractedText.selectionEnd = eue.f(j);
        extractedText.flags = !v4e.G(vneVarA, '\n') ? 1 : 0;
        return extractedText;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        if (eue.d(a().d)) {
            return null;
        }
        vne vneVarA = a();
        return vneVarA.c.subSequence(eue.g(vneVarA.d), eue.f(vneVarA.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        vne vneVarA = a();
        long j = vneVarA.d;
        CharSequence charSequence = vneVarA.c;
        int iF = eue.f(j);
        int iF2 = eue.f(vneVarA.d);
        int length = iF2 + i;
        if (((iF2 ^ length) & (i ^ length)) < 0) {
            length = charSequence.length();
        }
        return charSequence.subSequence(iF, Math.min(length, charSequence.length())).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        vne vneVarA = a();
        int iG = eue.g(vneVarA.d);
        int i3 = iG - i;
        if (((i ^ iG) & (iG ^ i3)) < 0) {
            i3 = 0;
        }
        return vneVarA.c.subSequence(Math.max(0, i3), eue.g(vneVarA.d)).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        switch (i) {
            case R.id.selectAll:
                int length = a().c.length();
                bw bwVar = this.a;
                bwVar.h(new ox6(bwVar, 0, length));
                break;
            case R.id.cut:
                b(277);
                break;
            case R.id.copy:
                b(278);
                break;
            case R.id.paste:
                b(279);
                break;
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:5:0x0006  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        int i2;
        if (i != 0) {
            switch (i) {
                case 2:
                    i2 = 2;
                    break;
                case 3:
                    i2 = 3;
                    break;
                case 4:
                    i2 = 4;
                    break;
                case 5:
                    i2 = 6;
                    break;
                case 6:
                    i2 = 7;
                    break;
                case 7:
                    i2 = 5;
                    break;
                default:
                    i2 = 1;
                    break;
            }
        } else {
            i2 = 1;
        }
        a26 a26Var = (a26) this.a.e;
        if (a26Var != null) {
            a26Var.d(new lx6(i2));
        }
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        int iN;
        Objects.toString(handwritingGesture);
        Objects.toString(executor);
        Objects.toString(intConsumer);
        int i = Build.VERSION.SDK_INT;
        if (i < 34) {
            return;
        }
        if (i >= 34) {
            bw bwVar = this.a;
            iN = hgc.N((z2f) bwVar.c, handwritingGesture, (ute) bwVar.w, (x16) bwVar.x, (rvf) bwVar.y);
        } else {
            iN = 2;
        }
        if (intConsumer == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new s60(intConsumer, iN, 1));
        } else {
            intConsumer.accept(iN);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        Objects.toString(bundle);
        return this.c.performPrivateCommand(str, bundle);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        Objects.toString(previewableHandwritingGesture);
        Objects.toString(cancellationSignal);
        int i = Build.VERSION.SDK_INT;
        if (i < 34 || i < 34) {
            return false;
        }
        bw bwVar = this.a;
        return hgc.P((z2f) bwVar.c, previewableHandwritingGesture, (ute) bwVar.w, cancellationSignal);
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0076  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        boolean z;
        boolean z2;
        boolean z3;
        lyd lydVar;
        CursorAnchorInfo cursorAnchorInfoA;
        c13 c13Var = (c13) this.a.v;
        boolean z4 = false;
        boolean z5 = (i & 1) != 0;
        boolean z6 = (i & 2) != 0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            z2 = (i & 16) != 0;
            z3 = (i & 8) != 0;
            boolean z7 = (i & 4) != 0;
            if (i2 >= 34 && (i & 32) != 0) {
                z4 = true;
            }
            if (z2 || z3 || z7 || z4) {
                z = z4;
                z4 = z7;
            } else {
                if (i2 >= 34) {
                    z = true;
                    z4 = true;
                } else {
                    z = z4;
                    z4 = true;
                }
                z2 = z4;
            }
            c13Var.f = z2;
            c13Var.g = z3;
            c13Var.h = z4;
            c13Var.i = z;
            if (z5 && (cursorAnchorInfoA = c13Var.a()) != null) {
                a90 a90Var = (a90) c13Var.c;
                a90Var.S().updateCursorAnchorInfo((View) a90Var.b, cursorAnchorInfoA);
            }
            lydVar = c13Var.e;
            if (!z6) {
                if (lydVar != null) {
                    lydVar.h(null);
                }
                c13Var.e = null;
                return true;
            }
            if (lydVar == null && lydVar.b()) {
                return true;
            }
            c13Var.e = ynb.V(c13Var.d, null, dw2.d, new a13(c13Var, null), 1);
            return true;
        }
        z = false;
        z2 = true;
        z3 = z2;
        c13Var.f = z2;
        c13Var.g = z3;
        c13Var.h = z4;
        c13Var.i = z;
        if (z5) {
            a90 a90Var2 = (a90) c13Var.c;
            a90Var2.S().updateCursorAnchorInfo((View) a90Var2.b, cursorAnchorInfoA);
        }
        lydVar = c13Var.e;
        if (!z6) {
            if (lydVar == null) {
            }
            c13Var.e = ynb.V(c13Var.d, null, dw2.d, new a13(c13Var, null), 1);
            return true;
        }
        if (lydVar != null) {
            lydVar.h(null);
        }
        c13Var.e = null;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        Objects.toString(keyEvent);
        a90 a90Var = (a90) ((ne2) this.a.d);
        a90Var.S().dispatchKeyEventFromInputMethod((View) a90Var.b, keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        bw bwVar = this.a;
        bwVar.h(new ox6(i, i2, bwVar, 2));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:62:0x01bb  */
    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        xtd xtdVar;
        yp5 w98Var;
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        String string = charSequence.toString();
        ArrayList arrayList = null;
        Spanned spanned = charSequence instanceof Spanned ? (Spanned) charSequence : null;
        if (spanned != null) {
            ArrayList arrayList2 = null;
            for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
                if (obj instanceof BackgroundColorSpan) {
                    xtdVar = new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, abg.c(((BackgroundColorSpan) obj).getBackgroundColor()), null, null, 63487);
                } else if (obj instanceof ForegroundColorSpan) {
                    xtdVar = new xtd(abg.c(((ForegroundColorSpan) obj).getForegroundColor()), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                } else if (obj instanceof StrikethroughSpan) {
                    xtdVar = new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.d, null, 61439);
                } else if (obj instanceof StyleSpan) {
                    int style = ((StyleSpan) obj).getStyle();
                    if (style == 1) {
                        xtdVar = new xtd(0L, 0L, ar5.z, null, null, null, null, 0L, null, null, null, 0L, null, null, 65531);
                    } else if (style == 2) {
                        xtdVar = new xtd(0L, 0L, null, new wq5(1), null, null, null, 0L, null, null, null, 0L, null, null, 65527);
                    } else if (style != 3) {
                        xtdVar = null;
                    } else {
                        xtdVar = new xtd(0L, 0L, ar5.z, new wq5(1), null, null, null, 0L, null, null, null, 0L, null, null, 65523);
                    }
                } else if (obj instanceof TypefaceSpan) {
                    TypefaceSpan typefaceSpan = (TypefaceSpan) obj;
                    String family = typefaceSpan.getFamily();
                    if (pa7.t(family, "cursive")) {
                        w98Var = yp5.e;
                    } else if (pa7.t(family, "monospace")) {
                        w98Var = yp5.d;
                    } else if (pa7.t(family, "sans-serif")) {
                        w98Var = yp5.b;
                    } else if (pa7.t(family, "serif")) {
                        w98Var = yp5.c;
                    } else {
                        String family2 = typefaceSpan.getFamily();
                        if (family2 == null || family2.length() == 0) {
                            w98Var = null;
                        } else {
                            Typeface typefaceCreate = Typeface.create(family2, 0);
                            Typeface typeface = Typeface.DEFAULT;
                            if (pa7.t(typefaceCreate, typeface) || pa7.t(typefaceCreate, Typeface.create(typeface, 0))) {
                                typefaceCreate = null;
                            }
                            if (typefaceCreate != null) {
                                w98Var = new w98(new kb6(4, typefaceCreate));
                            } else {
                                w98Var = null;
                            }
                        }
                    }
                    xtdVar = new xtd(0L, 0L, null, null, null, w98Var, null, 0L, null, null, null, 0L, null, null, 65503);
                } else if (obj instanceof UnderlineSpan) {
                    xtdVar = new xtd(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, mne.c, null, 61439);
                } else {
                    xtdVar = null;
                }
                if (xtdVar != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(new j00(xtdVar, spanned.getSpanStart(obj), spanned.getSpanEnd(obj)));
                }
            }
            arrayList = arrayList2;
        }
        this.a.h(new px6(string, (List) arrayList, i, false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        bw bwVar = this.a;
        bwVar.h(new ox6(bwVar, i, i2));
        ((a26) bwVar.f).d(Boolean.FALSE);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        Objects.toString(charSequence);
        if (charSequence == null) {
            return true;
        }
        this.a.h(new qx6(i, charSequence.toString(), false));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i, TextAttribute textAttribute) {
        Objects.toString(charSequence);
        Objects.toString(textAttribute);
        this.a.h(new px6(charSequence.toString(), (List) null, i, (Build.VERSION.SDK_INT < 37 || textAttribute == null) ? false : gq.a(textAttribute)));
        return true;
    }
}
