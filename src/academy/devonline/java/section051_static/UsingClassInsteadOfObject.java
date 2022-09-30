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

package academy.devonline.java.section051_static;

import java.util.Arrays;

/**
 * @author devonline
 * @link http://devonline.academy/java
 */
public class UsingClassInsteadOfObject {

    private static int value;

    public static int getValue() {
        return value;
    }

    public static void main(final String[] args) {
        value = 5;
        UsingClassInsteadOfObject.value = 8;

        System.out.println(value);
        System.out.println(UsingClassInsteadOfObject.value);
        System.out.println(getValue());
        System.out.println(UsingClassInsteadOfObject.getValue());

        System.out.println(Arrays.toString(new int[]{1, 2, 3}));
    }
}
