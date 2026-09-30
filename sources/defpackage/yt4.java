package defpackage;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yt4 extends qn4 {
    public final TextView s;
    public final st4 t;
    public boolean u = true;

    public yt4(TextView textView) {
        this.s = textView;
        this.t = new st4(textView);
    }

    @Override // defpackage.qn4
    public final InputFilter[] A(InputFilter[] inputFilterArr) {
        if (!this.u) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof st4) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() == 0) {
                return inputFilterArr;
            }
            int length = inputFilterArr.length;
            InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                if (sparseArray.indexOfKey(i3) < 0) {
                    inputFilterArr2[i2] = inputFilterArr[i3];
                    i2++;
                }
            }
            return inputFilterArr2;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            st4 st4Var = this.t;
            if (i4 >= length2) {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = st4Var;
                return inputFilterArr3;
            }
            if (inputFilterArr[i4] == st4Var) {
                return inputFilterArr;
            }
            i4++;
        }
    }

    @Override // defpackage.qn4
    public final void S(boolean z) {
        if (z) {
            V();
        }
    }

    @Override // defpackage.qn4
    public final void T(boolean z) {
        this.u = z;
        V();
        TextView textView = this.s;
        textView.setFilters(A(textView.getFilters()));
    }

    public final void V() {
        TextView textView = this.s;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.u) {
            if (!(transformationMethod instanceof cu4) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new cu4(transformationMethod);
            }
        } else if (transformationMethod instanceof cu4) {
            transformationMethod = ((cu4) transformationMethod).a;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}
