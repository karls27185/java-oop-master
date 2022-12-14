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

package academy.devonline.java.section001_classes;

/**
 * @author Karl
 * @link https://babayan.keenetic.link/
 */
public class UseConstructorOrNot {

    private final int[] result;

    private int count;

    public UseConstructorOrNot() {
        if (Runtime.getRuntime().availableProcessors() > 2) {
            result = new int[20];
        } else if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            result = new int[10];
        } else {
            result = new int[5];
        }
    }
}
