/*
 * Copyright 2019. http://devonline.academy
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package academy.devonline.java.section011_base_structures;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class ObjectDynaArray {

    private Element[] result = new Element[5];

    private int count;

    public void add(Element value) {
        if (count == result.length) {
            grow(result.length == 0 ? 5 : result.length * 2);
        }
        result[count++] = value;
    }

    private void grow(int newLength) {
        Element[] newArray = new Element[newLength];
        System.arraycopy(result, 0, newArray, 0, result.length);
        result = newArray;
    }

    public void clear() {
        for (int i = 0; i < count; i++) {
            result[i] = null;
        }
        count = 0;
    }

    public static void main(String[] args) {
        ObjectDynaArray dynaArray = new ObjectDynaArray();
        dynaArray.add(new Element());
        dynaArray.add(new Element());
        dynaArray.add(new Element());
        dynaArray.add(new Element());

        dynaArray.clear();

        System.out.println();
    }

    /**
     * @author devonline
     * @link http://devonline.academy/java
     */
    public static class Element {

    }
}
